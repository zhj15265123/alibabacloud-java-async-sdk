// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDateSourceGenerationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDateSourceGenerationsResponseBody</p>
 */
public class ListDateSourceGenerationsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListDateSourceGenerationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDateSourceGenerationsResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * List
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDateSourceGenerationsResponseBody build() {
            return new ListDateSourceGenerationsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("buildDeployId")
        private Integer buildDeployId;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("dataDumpRoot")
        private String dataDumpRoot;

        @NameInMap("generation")
        private Long generation;

        @NameInMap("partition")
        private java.util.Map < String, Integer > partition;

        @NameInMap("status")
        private String status;

        @NameInMap("timestamp")
        private Long timestamp;

        private Result(Builder builder) {
            this.buildDeployId = builder.buildDeployId;
            this.createTime = builder.createTime;
            this.dataDumpRoot = builder.dataDumpRoot;
            this.generation = builder.generation;
            this.partition = builder.partition;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return buildDeployId
         */
        public Integer getBuildDeployId() {
            return this.buildDeployId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataDumpRoot
         */
        public String getDataDumpRoot() {
            return this.dataDumpRoot;
        }

        /**
         * @return generation
         */
        public Long getGeneration() {
            return this.generation;
        }

        /**
         * @return partition
         */
        public java.util.Map < String, Integer > getPartition() {
            return this.partition;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Integer buildDeployId; 
            private Long createTime; 
            private String dataDumpRoot; 
            private Long generation; 
            private java.util.Map < String, Integer > partition; 
            private String status; 
            private Long timestamp; 

            /**
             * buildDeployId
             */
            public Builder buildDeployId(Integer buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dataDumpRoot.
             */
            public Builder dataDumpRoot(String dataDumpRoot) {
                this.dataDumpRoot = dataDumpRoot;
                return this;
            }

            /**
             * generation.
             */
            public Builder generation(Long generation) {
                this.generation = generation;
                return this;
            }

            /**
             * partition.
             */
            public Builder partition(java.util.Map < String, Integer > partition) {
                this.partition = partition;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
