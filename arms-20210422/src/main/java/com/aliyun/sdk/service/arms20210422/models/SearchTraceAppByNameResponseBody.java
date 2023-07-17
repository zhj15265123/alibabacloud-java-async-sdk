// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTraceAppByNameResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTraceAppByNameResponseBody</p>
 */
public class SearchTraceAppByNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TraceApps")
    private java.util.List < TraceApps> traceApps;

    private SearchTraceAppByNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traceApps = builder.traceApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTraceAppByNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceApps
     */
    public java.util.List < TraceApps> getTraceApps() {
        return this.traceApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TraceApps> traceApps; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TraceApps.
         */
        public Builder traceApps(java.util.List < TraceApps> traceApps) {
            this.traceApps = traceApps;
            return this;
        }

        public SearchTraceAppByNameResponseBody build() {
            return new SearchTraceAppByNameResponseBody(this);
        } 

    } 

    public static class TraceApps extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Show")
        private Boolean show;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        private TraceApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.labels = builder.labels;
            this.pid = builder.pid;
            this.regionId = builder.regionId;
            this.show = builder.show;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return labels
         */
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return show
         */
        public Boolean getShow() {
            return this.show;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private Long createTime; 
            private java.util.List < String > labels; 
            private String pid; 
            private String regionId; 
            private Boolean show; 
            private String type; 
            private Long updateTime; 
            private String userId; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(String pid) {
                this.pid = pid;
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
             * Show.
             */
            public Builder show(Boolean show) {
                this.show = show;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TraceApps build() {
                return new TraceApps(this);
            } 

        } 

    }
}
