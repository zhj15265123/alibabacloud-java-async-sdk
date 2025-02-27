// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMongoDBLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMongoDBLogConfigResponseBody</p>
 */
public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    @NameInMap("EnableAudit")
    private Boolean enableAudit;

    @NameInMap("IsEtlMetaExist")
    private Integer isEtlMetaExist;

    @NameInMap("IsUserProjectLogstoreExist")
    private Integer isUserProjectLogstoreExist;

    @NameInMap("PreserveStorageForStandard")
    private Long preserveStorageForStandard;

    @NameInMap("PreserveStorageForTrail")
    private Long preserveStorageForTrail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("TtlForStandard")
    private Long ttlForStandard;

    @NameInMap("TtlForTrail")
    private Long ttlForTrail;

    @NameInMap("UsedStorageForStandard")
    private Long usedStorageForStandard;

    @NameInMap("UsedStorageForTrail")
    private Long usedStorageForTrail;

    @NameInMap("UserProjectName")
    private String userProjectName;

    private DescribeMongoDBLogConfigResponseBody(Builder builder) {
        this.enableAudit = builder.enableAudit;
        this.isEtlMetaExist = builder.isEtlMetaExist;
        this.isUserProjectLogstoreExist = builder.isUserProjectLogstoreExist;
        this.preserveStorageForStandard = builder.preserveStorageForStandard;
        this.preserveStorageForTrail = builder.preserveStorageForTrail;
        this.requestId = builder.requestId;
        this.serviceType = builder.serviceType;
        this.ttlForStandard = builder.ttlForStandard;
        this.ttlForTrail = builder.ttlForTrail;
        this.usedStorageForStandard = builder.usedStorageForStandard;
        this.usedStorageForTrail = builder.usedStorageForTrail;
        this.userProjectName = builder.userProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMongoDBLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableAudit
     */
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    /**
     * @return isEtlMetaExist
     */
    public Integer getIsEtlMetaExist() {
        return this.isEtlMetaExist;
    }

    /**
     * @return isUserProjectLogstoreExist
     */
    public Integer getIsUserProjectLogstoreExist() {
        return this.isUserProjectLogstoreExist;
    }

    /**
     * @return preserveStorageForStandard
     */
    public Long getPreserveStorageForStandard() {
        return this.preserveStorageForStandard;
    }

    /**
     * @return preserveStorageForTrail
     */
    public Long getPreserveStorageForTrail() {
        return this.preserveStorageForTrail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return ttlForStandard
     */
    public Long getTtlForStandard() {
        return this.ttlForStandard;
    }

    /**
     * @return ttlForTrail
     */
    public Long getTtlForTrail() {
        return this.ttlForTrail;
    }

    /**
     * @return usedStorageForStandard
     */
    public Long getUsedStorageForStandard() {
        return this.usedStorageForStandard;
    }

    /**
     * @return usedStorageForTrail
     */
    public Long getUsedStorageForTrail() {
        return this.usedStorageForTrail;
    }

    /**
     * @return userProjectName
     */
    public String getUserProjectName() {
        return this.userProjectName;
    }

    public static final class Builder {
        private Boolean enableAudit; 
        private Integer isEtlMetaExist; 
        private Integer isUserProjectLogstoreExist; 
        private Long preserveStorageForStandard; 
        private Long preserveStorageForTrail; 
        private String requestId; 
        private String serviceType; 
        private Long ttlForStandard; 
        private Long ttlForTrail; 
        private Long usedStorageForStandard; 
        private Long usedStorageForTrail; 
        private String userProjectName; 

        /**
         * Indicates whether to enable the audit log feature is enabled.
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * Indicates whether a rule to distribute logs to Logtail is created. For more information, see [Logtail overview](~~28979~~). Valid values:
         * <p>
         * 
         * *   **1**: A rule to distribute logs to Logtail is created.
         * *   **0** or **null**: A rule to distribute logs to Logtail is not created.
         */
        public Builder isEtlMetaExist(Integer isEtlMetaExist) {
            this.isEtlMetaExist = isEtlMetaExist;
            return this;
        }

        /**
         * Indicates whether a Log Service project exists in the current region. Valid values:
         * <p>
         * 
         * *   **1**: A Log Service project exists in the current region.
         * *   **0** or **null**: A Log Service project does not exist in the current region.
         */
        public Builder isUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
            this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
            return this;
        }

        /**
         * The maximum storage space for the formal edition of the audit log feature. If the value is **-1**, no maximum is set.
         */
        public Builder preserveStorageForStandard(Long preserveStorageForStandard) {
            this.preserveStorageForStandard = preserveStorageForStandard;
            return this;
        }

        /**
         * The maximum storage space for the free trial edition of the audit log feature. Unit: bytes. You can set the maximum up to 107,374,182,400 bytes.
         */
        public Builder preserveStorageForTrail(Long preserveStorageForTrail) {
            this.preserveStorageForTrail = preserveStorageForTrail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the audit log feature. Valid values:
         * <p>
         * 
         * *   **Trail**: the free trial edition
         * *   **Standard**: the official edition
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * The retention period for the official edition of the audit log feature. Valid values: 1 to 365 days.
         */
        public Builder ttlForStandard(Long ttlForStandard) {
            this.ttlForStandard = ttlForStandard;
            return this;
        }

        /**
         * The retention period for the free trial edition of the audit log feature.
         */
        public Builder ttlForTrail(Long ttlForTrail) {
            this.ttlForTrail = ttlForTrail;
            return this;
        }

        /**
         * The used storage space for the formal edition of the audit log feature. Unit: bytes.
         */
        public Builder usedStorageForStandard(Long usedStorageForStandard) {
            this.usedStorageForStandard = usedStorageForStandard;
            return this;
        }

        /**
         * The used storage space for the free trial edition of the audit log feature. Unit: bytes.
         */
        public Builder usedStorageForTrail(Long usedStorageForTrail) {
            this.usedStorageForTrail = usedStorageForTrail;
            return this;
        }

        /**
         * The name of the Log Service project.
         */
        public Builder userProjectName(String userProjectName) {
            this.userProjectName = userProjectName;
            return this;
        }

        public DescribeMongoDBLogConfigResponseBody build() {
            return new DescribeMongoDBLogConfigResponseBody(this);
        } 

    } 

}
