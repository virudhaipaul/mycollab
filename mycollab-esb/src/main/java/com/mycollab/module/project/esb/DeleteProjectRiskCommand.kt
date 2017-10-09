package com.mycollab.module.project.esb

import com.google.common.eventbus.AllowConcurrentEvents
import com.google.common.eventbus.Subscribe
import com.mycollab.common.dao.CommentMapper
import com.mycollab.common.domain.CommentExample
import com.mycollab.common.domain.TagExample
import com.mycollab.common.service.TagService
import com.mycollab.module.ecm.service.ResourceService
import com.mycollab.module.esb.GenericCommand
import com.mycollab.module.file.AttachmentUtils
import com.mycollab.module.project.ProjectTypeConstants
import org.springframework.stereotype.Component

/**
 * @author MyCollab Ltd
 * @since 6.0.0
 */
@Component
class DeleteProjectRiskCommand(private val resourceService: ResourceService,
                               private val commentMapper: CommentMapper,
                               private val tagService: TagService) : GenericCommand() {

    @AllowConcurrentEvents
    @Subscribe
    fun removeRisk(event: DeleteProjectRiskEvent) {
        event.risks.forEach { risk ->
            removeRelatedFiles(event.accountId, risk.projectid, risk.id)
            removeRelatedComments(risk.id)
            removeRelatedTags(risk.id)
        }
    }

    private fun removeRelatedFiles(accountId: Int, projectId: Int, riskId: Int) {
        val attachmentPath = AttachmentUtils.getProjectEntityAttachmentPath(accountId, projectId,
                ProjectTypeConstants.RISK, "$riskId")
        resourceService.removeResource(attachmentPath, "", true, accountId)
    }

    private fun removeRelatedComments(riskId: Int) {
        val ex = CommentExample()
        ex.createCriteria().andTypeEqualTo(ProjectTypeConstants.RISK).andExtratypeidEqualTo(riskId)
        commentMapper.deleteByExample(ex)
    }

    private fun removeRelatedTags(riskId: Int) {
        val ex = TagExample()
        ex.createCriteria().andTypeEqualTo(ProjectTypeConstants.RISK).andTypeidEqualTo("$riskId")
        tagService.deleteByExample(ex)
    }
}