// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeConfigResponseBody</p>
 */
public class GetNodeConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetNodeConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeConfigResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetNodeConfigResponseBody build() {
            return new GetNodeConfigResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("active")
        private Boolean active;

        @NameInMap("dataDuplicateNumber")
        private Integer dataDuplicateNumber;

        @NameInMap("dataFragmentNumber")
        private Integer dataFragmentNumber;

        @NameInMap("minServicePercent")
        private Integer minServicePercent;

        @NameInMap("published")
        private Boolean published;

        private Result(Builder builder) {
            this.active = builder.active;
            this.dataDuplicateNumber = builder.dataDuplicateNumber;
            this.dataFragmentNumber = builder.dataFragmentNumber;
            this.minServicePercent = builder.minServicePercent;
            this.published = builder.published;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return dataDuplicateNumber
         */
        public Integer getDataDuplicateNumber() {
            return this.dataDuplicateNumber;
        }

        /**
         * @return dataFragmentNumber
         */
        public Integer getDataFragmentNumber() {
            return this.dataFragmentNumber;
        }

        /**
         * @return minServicePercent
         */
        public Integer getMinServicePercent() {
            return this.minServicePercent;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        public static final class Builder {
            private Boolean active; 
            private Integer dataDuplicateNumber; 
            private Integer dataFragmentNumber; 
            private Integer minServicePercent; 
            private Boolean published; 

            /**
             * active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * dataDuplicateNumber.
             */
            public Builder dataDuplicateNumber(Integer dataDuplicateNumber) {
                this.dataDuplicateNumber = dataDuplicateNumber;
                return this;
            }

            /**
             * dataFragmentNumber.
             */
            public Builder dataFragmentNumber(Integer dataFragmentNumber) {
                this.dataFragmentNumber = dataFragmentNumber;
                return this;
            }

            /**
             * minServicePercent.
             */
            public Builder minServicePercent(Integer minServicePercent) {
                this.minServicePercent = minServicePercent;
                return this;
            }

            /**
             * published.
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
