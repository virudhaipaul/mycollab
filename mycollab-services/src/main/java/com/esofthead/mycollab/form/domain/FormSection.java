/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_form_section*/
package com.esofthead.mycollab.form.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_form_section")
public class FormSection extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.id
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.name
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Length(max=100, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.layoutIndex
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Column("layoutIndex")
    private Integer layoutindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.module
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("module")
    private String module;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.sAccountId
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.layoutType
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Column("layoutType")
    private Integer layouttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_form_section.isDeleteSection
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    @Column("isDeleteSection")
    private Boolean isdeletesection;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        FormSection item = (FormSection)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(927, 747).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.id
     *
     * @return the value of m_form_section.id
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.id
     *
     * @param id the value for m_form_section.id
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.name
     *
     * @return the value of m_form_section.name
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.name
     *
     * @param name the value for m_form_section.name
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.layoutIndex
     *
     * @return the value of m_form_section.layoutIndex
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public Integer getLayoutindex() {
        return layoutindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.layoutIndex
     *
     * @param layoutindex the value for m_form_section.layoutIndex
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setLayoutindex(Integer layoutindex) {
        this.layoutindex = layoutindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.module
     *
     * @return the value of m_form_section.module
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.module
     *
     * @param module the value for m_form_section.module
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.sAccountId
     *
     * @return the value of m_form_section.sAccountId
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.sAccountId
     *
     * @param saccountid the value for m_form_section.sAccountId
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.layoutType
     *
     * @return the value of m_form_section.layoutType
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public Integer getLayouttype() {
        return layouttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.layoutType
     *
     * @param layouttype the value for m_form_section.layoutType
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setLayouttype(Integer layouttype) {
        this.layouttype = layouttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_form_section.isDeleteSection
     *
     * @return the value of m_form_section.isDeleteSection
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public Boolean getIsdeletesection() {
        return isdeletesection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_form_section.isDeleteSection
     *
     * @param isdeletesection the value for m_form_section.isDeleteSection
     *
     * @mbggenerated Tue May 24 18:34:15 ICT 2016
     */
    public void setIsdeletesection(Boolean isdeletesection) {
        this.isdeletesection = isdeletesection;
    }

    public enum Field {
        id,
        name,
        layoutindex,
        module,
        saccountid,
        layouttype,
        isdeletesection;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}