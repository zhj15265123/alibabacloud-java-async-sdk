// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePluginApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginApisResponseBody</p>
 */
public class DescribePluginApisResponseBody extends TeaModel {
    @NameInMap("ApiSummarys")
    private ApiSummarys apiSummarys;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePluginApisResponseBody(Builder builder) {
        this.apiSummarys = builder.apiSummarys;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginApisResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiSummarys
     */
    public ApiSummarys getApiSummarys() {
        return this.apiSummarys;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ApiSummarys apiSummarys; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ApiSummarys.
         */
        public Builder apiSummarys(ApiSummarys apiSummarys) {
            this.apiSummarys = apiSummarys;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePluginApisResponseBody build() {
            return new DescribePluginApisResponseBody(this);
        } 

    } 

    public static class ApiPluginSummary extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Method")
        private String method;

        @NameInMap("Path")
        private String path;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StageName")
        private String stageName;

        private ApiPluginSummary(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.method = builder.method;
            this.path = builder.path;
            this.regionId = builder.regionId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiPluginSummary create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String method; 
            private String path; 
            private String regionId; 
            private String stageName; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public ApiPluginSummary build() {
                return new ApiPluginSummary(this);
            } 

        } 

    }
    public static class ApiSummarys extends TeaModel {
        @NameInMap("ApiPluginSummary")
        private java.util.List < ApiPluginSummary> apiPluginSummary;

        private ApiSummarys(Builder builder) {
            this.apiPluginSummary = builder.apiPluginSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiSummarys create() {
            return builder().build();
        }

        /**
         * @return apiPluginSummary
         */
        public java.util.List < ApiPluginSummary> getApiPluginSummary() {
            return this.apiPluginSummary;
        }

        public static final class Builder {
            private java.util.List < ApiPluginSummary> apiPluginSummary; 

            /**
             * ApiPluginSummary.
             */
            public Builder apiPluginSummary(java.util.List < ApiPluginSummary> apiPluginSummary) {
                this.apiPluginSummary = apiPluginSummary;
                return this;
            }

            public ApiSummarys build() {
                return new ApiSummarys(this);
            } 

        } 

    }
}
