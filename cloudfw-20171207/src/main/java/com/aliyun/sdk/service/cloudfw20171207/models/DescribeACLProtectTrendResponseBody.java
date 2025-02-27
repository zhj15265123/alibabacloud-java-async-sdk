// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeACLProtectTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeACLProtectTrendResponseBody</p>
 */
public class DescribeACLProtectTrendResponseBody extends TeaModel {
    @NameInMap("InProtectCnt")
    private Long inProtectCnt;

    @NameInMap("InterVPCProtectCnt")
    private Long interVPCProtectCnt;

    @NameInMap("Interval")
    private Integer interval;

    @NameInMap("OutProtectCnt")
    private Long outProtectCnt;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalProtectCnt")
    private Long totalProtectCnt;

    @NameInMap("TrendList")
    private java.util.List < TrendList> trendList;

    private DescribeACLProtectTrendResponseBody(Builder builder) {
        this.inProtectCnt = builder.inProtectCnt;
        this.interVPCProtectCnt = builder.interVPCProtectCnt;
        this.interval = builder.interval;
        this.outProtectCnt = builder.outProtectCnt;
        this.requestId = builder.requestId;
        this.totalProtectCnt = builder.totalProtectCnt;
        this.trendList = builder.trendList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeACLProtectTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return inProtectCnt
     */
    public Long getInProtectCnt() {
        return this.inProtectCnt;
    }

    /**
     * @return interVPCProtectCnt
     */
    public Long getInterVPCProtectCnt() {
        return this.interVPCProtectCnt;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return outProtectCnt
     */
    public Long getOutProtectCnt() {
        return this.outProtectCnt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalProtectCnt
     */
    public Long getTotalProtectCnt() {
        return this.totalProtectCnt;
    }

    /**
     * @return trendList
     */
    public java.util.List < TrendList> getTrendList() {
        return this.trendList;
    }

    public static final class Builder {
        private Long inProtectCnt; 
        private Long interVPCProtectCnt; 
        private Integer interval; 
        private Long outProtectCnt; 
        private String requestId; 
        private Long totalProtectCnt; 
        private java.util.List < TrendList> trendList; 

        /**
         * InProtectCnt.
         */
        public Builder inProtectCnt(Long inProtectCnt) {
            this.inProtectCnt = inProtectCnt;
            return this;
        }

        /**
         * InterVPCProtectCnt.
         */
        public Builder interVPCProtectCnt(Long interVPCProtectCnt) {
            this.interVPCProtectCnt = interVPCProtectCnt;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * OutProtectCnt.
         */
        public Builder outProtectCnt(Long outProtectCnt) {
            this.outProtectCnt = outProtectCnt;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalProtectCnt.
         */
        public Builder totalProtectCnt(Long totalProtectCnt) {
            this.totalProtectCnt = totalProtectCnt;
            return this;
        }

        /**
         * TrendList.
         */
        public Builder trendList(java.util.List < TrendList> trendList) {
            this.trendList = trendList;
            return this;
        }

        public DescribeACLProtectTrendResponseBody build() {
            return new DescribeACLProtectTrendResponseBody(this);
        } 

    } 

    public static class TrendList extends TeaModel {
        @NameInMap("ProtectCnt")
        private Integer protectCnt;

        @NameInMap("Time")
        private Long time;

        private TrendList(Builder builder) {
            this.protectCnt = builder.protectCnt;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrendList create() {
            return builder().build();
        }

        /**
         * @return protectCnt
         */
        public Integer getProtectCnt() {
            return this.protectCnt;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer protectCnt; 
            private Long time; 

            /**
             * ProtectCnt.
             */
            public Builder protectCnt(Integer protectCnt) {
                this.protectCnt = protectCnt;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public TrendList build() {
                return new TrendList(this);
            } 

        } 

    }
}
