// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLogsResponseBody</p>
 */
public class GetLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLogsResponseBody build() {
            return new GetLogsResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @NameInMap("CompleteOrNot")
        private Boolean completeOrNot;

        @NameInMap("Cost")
        private Long cost;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("HasSql")
        private Boolean hasSql;

        @NameInMap("Keys")
        private java.util.List < String > keys;

        @NameInMap("Lines")
        private java.util.List < ? > lines;

        private ResponseData(Builder builder) {
            this.completeOrNot = builder.completeOrNot;
            this.cost = builder.cost;
            this.count = builder.count;
            this.hasSql = builder.hasSql;
            this.keys = builder.keys;
            this.lines = builder.lines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return completeOrNot
         */
        public Boolean getCompleteOrNot() {
            return this.completeOrNot;
        }

        /**
         * @return cost
         */
        public Long getCost() {
            return this.cost;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return hasSql
         */
        public Boolean getHasSql() {
            return this.hasSql;
        }

        /**
         * @return keys
         */
        public java.util.List < String > getKeys() {
            return this.keys;
        }

        /**
         * @return lines
         */
        public java.util.List < ? > getLines() {
            return this.lines;
        }

        public static final class Builder {
            private Boolean completeOrNot; 
            private Long cost; 
            private Integer count; 
            private Boolean hasSql; 
            private java.util.List < String > keys; 
            private java.util.List < ? > lines; 

            /**
             * CompleteOrNot.
             */
            public Builder completeOrNot(Boolean completeOrNot) {
                this.completeOrNot = completeOrNot;
                return this;
            }

            /**
             * Cost.
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * HasSql.
             */
            public Builder hasSql(Boolean hasSql) {
                this.hasSql = hasSql;
                return this;
            }

            /**
             * Keys.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * Lines.
             */
            public Builder lines(java.util.List < ? > lines) {
                this.lines = lines;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageInfo")
        private PageInfo pageInfo;

        @NameInMap("ResponseData")
        private ResponseData responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public ResponseData getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private ResponseData responseData; 

            /**
             * PageInfo.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * ResponseData.
             */
            public Builder responseData(ResponseData responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
