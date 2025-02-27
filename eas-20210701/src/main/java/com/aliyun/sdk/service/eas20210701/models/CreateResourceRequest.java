// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @Body
    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @Body
    @NameInMap("ChargeType")
    private String chargeType;

    @Body
    @NameInMap("EcsInstanceCount")
    private Integer ecsInstanceCount;

    @Body
    @NameInMap("EcsInstanceType")
    private String ecsInstanceType;

    @Body
    @NameInMap("ExternalClusterId")
    private String externalClusterId;

    @Body
    @NameInMap("NodeMatchLabels")
    private java.util.Map < String, String > nodeMatchLabels;

    @Body
    @NameInMap("NodeTolerations")
    private java.util.List < NodeTolerations> nodeTolerations;

    @Body
    @NameInMap("ResourceType")
    private String resourceType;

    @Body
    @NameInMap("RoleName")
    private String roleName;

    @Body
    @NameInMap("SystemDiskSize")
    @Validation(maximum = 2000, minimum = 200)
    private Integer systemDiskSize;

    @Body
    @NameInMap("Zone")
    private String zone;

    private CreateResourceRequest(Builder builder) {
        super(builder);
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.ecsInstanceCount = builder.ecsInstanceCount;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.externalClusterId = builder.externalClusterId;
        this.nodeMatchLabels = builder.nodeMatchLabels;
        this.nodeTolerations = builder.nodeTolerations;
        this.resourceType = builder.resourceType;
        this.roleName = builder.roleName;
        this.systemDiskSize = builder.systemDiskSize;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return ecsInstanceCount
     */
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    /**
     * @return ecsInstanceType
     */
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    /**
     * @return externalClusterId
     */
    public String getExternalClusterId() {
        return this.externalClusterId;
    }

    /**
     * @return nodeMatchLabels
     */
    public java.util.Map < String, String > getNodeMatchLabels() {
        return this.nodeMatchLabels;
    }

    /**
     * @return nodeTolerations
     */
    public java.util.List < NodeTolerations> getNodeTolerations() {
        return this.nodeTolerations;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<CreateResourceRequest, Builder> {
        private Boolean autoRenewal; 
        private String chargeType; 
        private Integer ecsInstanceCount; 
        private String ecsInstanceType; 
        private String externalClusterId; 
        private java.util.Map < String, String > nodeMatchLabels; 
        private java.util.List < NodeTolerations> nodeTolerations; 
        private String resourceType; 
        private String roleName; 
        private Integer systemDiskSize; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRequest request) {
            super(request);
            this.autoRenewal = request.autoRenewal;
            this.chargeType = request.chargeType;
            this.ecsInstanceCount = request.ecsInstanceCount;
            this.ecsInstanceType = request.ecsInstanceType;
            this.externalClusterId = request.externalClusterId;
            this.nodeMatchLabels = request.nodeMatchLabels;
            this.nodeTolerations = request.nodeTolerations;
            this.resourceType = request.resourceType;
            this.roleName = request.roleName;
            this.systemDiskSize = request.systemDiskSize;
            this.zone = request.zone;
        } 

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putBodyParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * EcsInstanceCount.
         */
        public Builder ecsInstanceCount(Integer ecsInstanceCount) {
            this.putBodyParameter("EcsInstanceCount", ecsInstanceCount);
            this.ecsInstanceCount = ecsInstanceCount;
            return this;
        }

        /**
         * EcsInstanceType.
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putBodyParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }

        /**
         * ExternalClusterId.
         */
        public Builder externalClusterId(String externalClusterId) {
            this.putBodyParameter("ExternalClusterId", externalClusterId);
            this.externalClusterId = externalClusterId;
            return this;
        }

        /**
         * NodeMatchLabels.
         */
        public Builder nodeMatchLabels(java.util.Map < String, String > nodeMatchLabels) {
            this.putBodyParameter("NodeMatchLabels", nodeMatchLabels);
            this.nodeMatchLabels = nodeMatchLabels;
            return this;
        }

        /**
         * NodeTolerations.
         */
        public Builder nodeTolerations(java.util.List < NodeTolerations> nodeTolerations) {
            this.putBodyParameter("NodeTolerations", nodeTolerations);
            this.nodeTolerations = nodeTolerations;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * Zone.
         */
        public Builder zone(String zone) {
            this.putBodyParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public CreateResourceRequest build() {
            return new CreateResourceRequest(this);
        } 

    } 

    public static class NodeTolerations extends TeaModel {
        @NameInMap("effect")
        private String effect;

        @NameInMap("key")
        private String key;

        @NameInMap("operator")
        private String operator;

        @NameInMap("value")
        private String value;

        private NodeTolerations(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeTolerations create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String operator; 
            private String value; 

            /**
             * effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NodeTolerations build() {
                return new NodeTolerations(this);
            } 

        } 

    }
}
