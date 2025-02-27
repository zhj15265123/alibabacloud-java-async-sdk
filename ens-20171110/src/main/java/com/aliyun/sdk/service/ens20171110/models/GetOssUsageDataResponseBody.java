// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssUsageDataResponseBody</p>
 */
public class GetOssUsageDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsageList")
    private java.util.List < UsageList> usageList;

    private GetOssUsageDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageList = builder.usageList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageList
     */
    public java.util.List < UsageList> getUsageList() {
        return this.usageList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UsageList> usageList; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageList.
         */
        public Builder usageList(java.util.List < UsageList> usageList) {
            this.usageList = usageList;
            return this;
        }

        public GetOssUsageDataResponseBody build() {
            return new GetOssUsageDataResponseBody(this);
        } 

    } 

    public static class UsageList extends TeaModel {
        @NameInMap("LanRxBw")
        private Long lanRxBw;

        @NameInMap("LanTxBw")
        private Long lanTxBw;

        @NameInMap("Point")
        private Long point;

        @NameInMap("PointTs")
        private String pointTs;

        @NameInMap("StorageUsageByte")
        private Long storageUsageByte;

        @NameInMap("WanRxBw")
        private Long wanRxBw;

        @NameInMap("WanTxBw")
        private Long wanTxBw;

        private UsageList(Builder builder) {
            this.lanRxBw = builder.lanRxBw;
            this.lanTxBw = builder.lanTxBw;
            this.point = builder.point;
            this.pointTs = builder.pointTs;
            this.storageUsageByte = builder.storageUsageByte;
            this.wanRxBw = builder.wanRxBw;
            this.wanTxBw = builder.wanTxBw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageList create() {
            return builder().build();
        }

        /**
         * @return lanRxBw
         */
        public Long getLanRxBw() {
            return this.lanRxBw;
        }

        /**
         * @return lanTxBw
         */
        public Long getLanTxBw() {
            return this.lanTxBw;
        }

        /**
         * @return point
         */
        public Long getPoint() {
            return this.point;
        }

        /**
         * @return pointTs
         */
        public String getPointTs() {
            return this.pointTs;
        }

        /**
         * @return storageUsageByte
         */
        public Long getStorageUsageByte() {
            return this.storageUsageByte;
        }

        /**
         * @return wanRxBw
         */
        public Long getWanRxBw() {
            return this.wanRxBw;
        }

        /**
         * @return wanTxBw
         */
        public Long getWanTxBw() {
            return this.wanTxBw;
        }

        public static final class Builder {
            private Long lanRxBw; 
            private Long lanTxBw; 
            private Long point; 
            private String pointTs; 
            private Long storageUsageByte; 
            private Long wanRxBw; 
            private Long wanTxBw; 

            /**
             * LanRxBw.
             */
            public Builder lanRxBw(Long lanRxBw) {
                this.lanRxBw = lanRxBw;
                return this;
            }

            /**
             * LanTxBw.
             */
            public Builder lanTxBw(Long lanTxBw) {
                this.lanTxBw = lanTxBw;
                return this;
            }

            /**
             * Point.
             */
            public Builder point(Long point) {
                this.point = point;
                return this;
            }

            /**
             * PointTs.
             */
            public Builder pointTs(String pointTs) {
                this.pointTs = pointTs;
                return this;
            }

            /**
             * StorageUsageByte.
             */
            public Builder storageUsageByte(Long storageUsageByte) {
                this.storageUsageByte = storageUsageByte;
                return this;
            }

            /**
             * WanRxBw.
             */
            public Builder wanRxBw(Long wanRxBw) {
                this.wanRxBw = wanRxBw;
                return this;
            }

            /**
             * WanTxBw.
             */
            public Builder wanTxBw(Long wanTxBw) {
                this.wanTxBw = wanTxBw;
                return this;
            }

            public UsageList build() {
                return new UsageList(this);
            } 

        } 

    }
}
