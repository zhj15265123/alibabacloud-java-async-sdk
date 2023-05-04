// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindBatchAxgRequest} extends {@link RequestModel}
 *
 * <p>BindBatchAxgRequest</p>
 */
public class BindBatchAxgRequest extends Request {
    @Query
    @NameInMap("AxgBindList")
    @Validation(required = true)
    private java.util.List < AxgBindList> axgBindList;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PoolKey")
    private String poolKey;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private BindBatchAxgRequest(Builder builder) {
        super(builder);
        this.axgBindList = builder.axgBindList;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindBatchAxgRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return axgBindList
     */
    public java.util.List < AxgBindList> getAxgBindList() {
        return this.axgBindList;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<BindBatchAxgRequest, Builder> {
        private java.util.List < AxgBindList> axgBindList; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(BindBatchAxgRequest request) {
            super(request);
            this.axgBindList = request.axgBindList;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AxgBindList.
         */
        public Builder axgBindList(java.util.List < AxgBindList> axgBindList) {
            String axgBindListShrink = shrink(axgBindList, "AxgBindList", "json");
            this.putQueryParameter("AxgBindList", axgBindListShrink);
            this.axgBindList = axgBindList;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PoolKey.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public BindBatchAxgRequest build() {
            return new BindBatchAxgRequest(this);
        } 

    } 

    public static class AxgBindList extends TeaModel {
        @NameInMap("ASRModelId")
        private String ASRModelId;

        @NameInMap("ASRStatus")
        private Boolean ASRStatus;

        @NameInMap("CallDisplayType")
        private Integer callDisplayType;

        @NameInMap("CallRestrict")
        private String callRestrict;

        @NameInMap("ExpectCity")
        private String expectCity;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("GroupId")
        @Validation(required = true)
        private String groupId;

        @NameInMap("IsRecordingEnabled")
        private Boolean isRecordingEnabled;

        @NameInMap("OutId")
        private String outId;

        @NameInMap("OutOrderId")
        private String outOrderId;

        @NameInMap("PhoneNoA")
        @Validation(required = true)
        private String phoneNoA;

        @NameInMap("PhoneNoB")
        private String phoneNoB;

        @NameInMap("PhoneNoX")
        private String phoneNoX;

        @NameInMap("RingConfig")
        private String ringConfig;

        private AxgBindList(Builder builder) {
            this.ASRModelId = builder.ASRModelId;
            this.ASRStatus = builder.ASRStatus;
            this.callDisplayType = builder.callDisplayType;
            this.callRestrict = builder.callRestrict;
            this.expectCity = builder.expectCity;
            this.expiration = builder.expiration;
            this.groupId = builder.groupId;
            this.isRecordingEnabled = builder.isRecordingEnabled;
            this.outId = builder.outId;
            this.outOrderId = builder.outOrderId;
            this.phoneNoA = builder.phoneNoA;
            this.phoneNoB = builder.phoneNoB;
            this.phoneNoX = builder.phoneNoX;
            this.ringConfig = builder.ringConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AxgBindList create() {
            return builder().build();
        }

        /**
         * @return ASRModelId
         */
        public String getASRModelId() {
            return this.ASRModelId;
        }

        /**
         * @return ASRStatus
         */
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        /**
         * @return callDisplayType
         */
        public Integer getCallDisplayType() {
            return this.callDisplayType;
        }

        /**
         * @return callRestrict
         */
        public String getCallRestrict() {
            return this.callRestrict;
        }

        /**
         * @return expectCity
         */
        public String getExpectCity() {
            return this.expectCity;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isRecordingEnabled
         */
        public Boolean getIsRecordingEnabled() {
            return this.isRecordingEnabled;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return phoneNoA
         */
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        /**
         * @return phoneNoB
         */
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        /**
         * @return phoneNoX
         */
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        /**
         * @return ringConfig
         */
        public String getRingConfig() {
            return this.ringConfig;
        }

        public static final class Builder {
            private String ASRModelId; 
            private Boolean ASRStatus; 
            private Integer callDisplayType; 
            private String callRestrict; 
            private String expectCity; 
            private String expiration; 
            private String groupId; 
            private Boolean isRecordingEnabled; 
            private String outId; 
            private String outOrderId; 
            private String phoneNoA; 
            private String phoneNoB; 
            private String phoneNoX; 
            private String ringConfig; 

            /**
             * ASRModelId.
             */
            public Builder ASRModelId(String ASRModelId) {
                this.ASRModelId = ASRModelId;
                return this;
            }

            /**
             * ASRStatus.
             */
            public Builder ASRStatus(Boolean ASRStatus) {
                this.ASRStatus = ASRStatus;
                return this;
            }

            /**
             * CallDisplayType.
             */
            public Builder callDisplayType(Integer callDisplayType) {
                this.callDisplayType = callDisplayType;
                return this;
            }

            /**
             * CallRestrict.
             */
            public Builder callRestrict(String callRestrict) {
                this.callRestrict = callRestrict;
                return this;
            }

            /**
             * ExpectCity.
             */
            public Builder expectCity(String expectCity) {
                this.expectCity = expectCity;
                return this;
            }

            /**
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IsRecordingEnabled.
             */
            public Builder isRecordingEnabled(Boolean isRecordingEnabled) {
                this.isRecordingEnabled = isRecordingEnabled;
                return this;
            }

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * OutOrderId.
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
                return this;
            }

            /**
             * PhoneNoA.
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * PhoneNoB.
             */
            public Builder phoneNoB(String phoneNoB) {
                this.phoneNoB = phoneNoB;
                return this;
            }

            /**
             * PhoneNoX.
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            /**
             * RingConfig.
             */
            public Builder ringConfig(String ringConfig) {
                this.ringConfig = ringConfig;
                return this;
            }

            public AxgBindList build() {
                return new AxgBindList(this);
            } 

        } 

    }
}
