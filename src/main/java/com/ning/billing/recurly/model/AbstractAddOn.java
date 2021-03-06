/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.recurly.model;

import javax.xml.bind.annotation.XmlElement;
import com.google.common.base.Objects;

public class AbstractAddOn extends RecurlyObject {

    @XmlElement(name = "add_on_code")
    protected String addOnCode;

    @XmlElement(name = "measured_unit_id")
    protected Long measuredUnitId;

    @XmlElement(name = "usage_type")
    protected String usageType;

    public String getAddOnCode() {
        return addOnCode;
    }

    public void setAddOnCode(final Object addOnCode) {
        this.addOnCode = stringOrNull(addOnCode);
    }

    public Long getMeasuredUnitId() {
        return measuredUnitId;
    }

    public void setMeasuredUnitId(final Object measuredUnitId) {
        this.measuredUnitId = longOrNull(measuredUnitId);
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(final Object usageType) {
        this.usageType = stringOrNull(usageType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractAddOn{");
        sb.append("addOnCode='").append(addOnCode).append('\'');
        sb.append("measuredUnitId='").append(measuredUnitId).append('\'');
        sb.append("usageType='").append(usageType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final AbstractAddOn that = (AbstractAddOn) o;

        if (addOnCode != null ? !addOnCode.equals(that.addOnCode) : that.addOnCode != null) {
            return false;
        }

        if (measuredUnitId != null ? !measuredUnitId.equals(that.measuredUnitId) : that.measuredUnitId != null) {
            return false;
        }

        if (usageType != null ? !usageType.equals(that.usageType) : that.usageType != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(addOnCode, measuredUnitId, usageType);
    }
}
