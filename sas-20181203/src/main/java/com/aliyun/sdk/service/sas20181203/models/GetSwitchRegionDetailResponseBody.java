// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwitchRegionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwitchRegionDetailResponseBody</p>
 */
public class GetSwitchRegionDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSwitchRegionDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwitchRegionDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSwitchRegionDetailResponseBody build() {
            return new GetSwitchRegionDetailResponseBody(this);
        } 

    } 

    public static class RegionStatus extends TeaModel {
        @NameInMap("EcsCount")
        private Integer ecsCount;

        @NameInMap("GmtPlanSwitchTime")
        private Long gmtPlanSwitchTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private Integer status;

        private RegionStatus(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.gmtPlanSwitchTime = builder.gmtPlanSwitchTime;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatus create() {
            return builder().build();
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return gmtPlanSwitchTime
         */
        public Long getGmtPlanSwitchTime() {
            return this.gmtPlanSwitchTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer ecsCount; 
            private Long gmtPlanSwitchTime; 
            private String regionId; 
            private Integer status; 

            /**
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * GmtPlanSwitchTime.
             */
            public Builder gmtPlanSwitchTime(Long gmtPlanSwitchTime) {
                this.gmtPlanSwitchTime = gmtPlanSwitchTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public RegionStatus build() {
                return new RegionStatus(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("GmtIsAgreeModified")
        private Long gmtIsAgreeModified;

        @NameInMap("GmtNoticed")
        private Long gmtNoticed;

        @NameInMap("IsAgree")
        private String isAgree;

        @NameInMap("IsNoticed")
        private String isNoticed;

        @NameInMap("RegionStatus")
        private java.util.List < RegionStatus> regionStatus;

        private Data(Builder builder) {
            this.gmtIsAgreeModified = builder.gmtIsAgreeModified;
            this.gmtNoticed = builder.gmtNoticed;
            this.isAgree = builder.isAgree;
            this.isNoticed = builder.isNoticed;
            this.regionStatus = builder.regionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtIsAgreeModified
         */
        public Long getGmtIsAgreeModified() {
            return this.gmtIsAgreeModified;
        }

        /**
         * @return gmtNoticed
         */
        public Long getGmtNoticed() {
            return this.gmtNoticed;
        }

        /**
         * @return isAgree
         */
        public String getIsAgree() {
            return this.isAgree;
        }

        /**
         * @return isNoticed
         */
        public String getIsNoticed() {
            return this.isNoticed;
        }

        /**
         * @return regionStatus
         */
        public java.util.List < RegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

        public static final class Builder {
            private Long gmtIsAgreeModified; 
            private Long gmtNoticed; 
            private String isAgree; 
            private String isNoticed; 
            private java.util.List < RegionStatus> regionStatus; 

            /**
             * GmtIsAgreeModified.
             */
            public Builder gmtIsAgreeModified(Long gmtIsAgreeModified) {
                this.gmtIsAgreeModified = gmtIsAgreeModified;
                return this;
            }

            /**
             * GmtNoticed.
             */
            public Builder gmtNoticed(Long gmtNoticed) {
                this.gmtNoticed = gmtNoticed;
                return this;
            }

            /**
             * IsAgree.
             */
            public Builder isAgree(String isAgree) {
                this.isAgree = isAgree;
                return this;
            }

            /**
             * IsNoticed.
             */
            public Builder isNoticed(String isNoticed) {
                this.isNoticed = isNoticed;
                return this;
            }

            /**
             * RegionStatus.
             */
            public Builder regionStatus(java.util.List < RegionStatus> regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
