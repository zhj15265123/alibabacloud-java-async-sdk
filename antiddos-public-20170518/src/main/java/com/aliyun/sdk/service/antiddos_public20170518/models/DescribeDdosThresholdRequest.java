// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosThresholdRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosThresholdRequest</p>
 */
public class DescribeDdosThresholdRequest extends Request {
    @Query
    @NameInMap("DdosRegionId")
    @Validation(required = true)
    private String ddosRegionId;

    @Query
    @NameInMap("DdosType")
    @Validation(required = true)
    private String ddosType;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    private DescribeDdosThresholdRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.ddosType = builder.ddosType;
        this.instanceIds = builder.instanceIds;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosThresholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return ddosType
     */
    public String getDdosType() {
        return this.ddosType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<DescribeDdosThresholdRequest, Builder> {
        private String ddosRegionId; 
        private String ddosType; 
        private java.util.List < String > instanceIds; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosThresholdRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.ddosType = request.ddosType;
            this.instanceIds = request.instanceIds;
            this.instanceType = request.instanceType;
        } 

        /**
         * DdosRegionId.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * DdosType.
         */
        public Builder ddosType(String ddosType) {
            this.putQueryParameter("DdosType", ddosType);
            this.ddosType = ddosType;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public DescribeDdosThresholdRequest build() {
            return new DescribeDdosThresholdRequest(this);
        } 

    } 

}
