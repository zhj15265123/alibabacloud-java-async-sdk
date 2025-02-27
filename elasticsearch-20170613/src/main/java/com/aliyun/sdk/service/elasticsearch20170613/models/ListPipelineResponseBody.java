// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineResponseBody</p>
 */
public class ListPipelineResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListPipelineResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The header of the response.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
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
         * The response.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListPipelineResponseBody build() {
            return new ListPipelineResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            /**
             * The total number of returned entries.
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @NameInMap("pipelineId")
        private String pipelineId;

        @NameInMap("pipelineStatus")
        private String pipelineStatus;

        private Result(Builder builder) {
            this.gmtCreatedTime = builder.gmtCreatedTime;
            this.gmtUpdateTime = builder.gmtUpdateTime;
            this.pipelineId = builder.pipelineId;
            this.pipelineStatus = builder.pipelineStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreatedTime
         */
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        /**
         * @return gmtUpdateTime
         */
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineStatus
         */
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

        public static final class Builder {
            private String gmtCreatedTime; 
            private String gmtUpdateTime; 
            private String pipelineId; 
            private String pipelineStatus; 

            /**
             * The time when the pipeline was created.
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * The time when the pipeline was updated.
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * The ID of the ApsaraVideo Media Processing (MPS) queue that is used to run the job.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The status of the pipeline. Supported:
             * <p>
             * 
             * *   NOT_DEPLOYED: The node is not deployed.
             * *   RUNNING
             * *   DELETED: Deleted. The console does not display this status.
             */
            public Builder pipelineStatus(String pipelineStatus) {
                this.pipelineStatus = pipelineStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
