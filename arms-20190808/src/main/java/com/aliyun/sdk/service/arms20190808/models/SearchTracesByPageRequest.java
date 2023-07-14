// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTracesByPageRequest} extends {@link RequestModel}
 *
 * <p>SearchTracesByPageRequest</p>
 */
public class SearchTracesByPageRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ExclusionFilters")
    private java.util.List < ExclusionFilters> exclusionFilters;

    @Query
    @NameInMap("IsError")
    private Boolean isError;

    @Query
    @NameInMap("MinDuration")
    private Long minDuration;

    @Query
    @NameInMap("OperationName")
    private String operationName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    @Query
    @NameInMap("ServiceIp")
    private String serviceIp;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private SearchTracesByPageRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.exclusionFilters = builder.exclusionFilters;
        this.isError = builder.isError;
        this.minDuration = builder.minDuration;
        this.operationName = builder.operationName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.reverse = builder.reverse;
        this.serviceIp = builder.serviceIp;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTracesByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return exclusionFilters
     */
    public java.util.List < ExclusionFilters> getExclusionFilters() {
        return this.exclusionFilters;
    }

    /**
     * @return isError
     */
    public Boolean getIsError() {
        return this.isError;
    }

    /**
     * @return minDuration
     */
    public Long getMinDuration() {
        return this.minDuration;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
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
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return serviceIp
     */
    public String getServiceIp() {
        return this.serviceIp;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<SearchTracesByPageRequest, Builder> {
        private Long endTime; 
        private java.util.List < ExclusionFilters> exclusionFilters; 
        private Boolean isError; 
        private Long minDuration; 
        private String operationName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pid; 
        private String regionId; 
        private Boolean reverse; 
        private String serviceIp; 
        private String serviceName; 
        private Long startTime; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(SearchTracesByPageRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.exclusionFilters = request.exclusionFilters;
            this.isError = request.isError;
            this.minDuration = request.minDuration;
            this.operationName = request.operationName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.reverse = request.reverse;
            this.serviceIp = request.serviceIp;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
            this.tags = request.tags;
        } 

        /**
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The filter conditions.
         */
        public Builder exclusionFilters(java.util.List < ExclusionFilters> exclusionFilters) {
            this.putQueryParameter("ExclusionFilters", exclusionFilters);
            this.exclusionFilters = exclusionFilters;
            return this;
        }

        /**
         * 是否过滤错误的调用链。
         * <p>
         * - `true`：过滤
         * - `false`（默认）：不过滤
         */
        public Builder isError(Boolean isError) {
            this.putQueryParameter("IsError", isError);
            this.isError = isError;
            return this;
        }

        /**
         * The minimum amount of time consumed by traces. Unit: milliseconds.
         */
        public Builder minDuration(Long minDuration) {
            this.putQueryParameter("MinDuration", minDuration);
            this.minDuration = minDuration;
            return this;
        }

        /**
         * The name of the traced span.
         */
        public Builder operationName(String operationName) {
            this.putQueryParameter("OperationName", operationName);
            this.operationName = operationName;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The application ID.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to sort the query results in chronological order or reverse chronological order. Default value: `false`.
         * <p>
         * 
         * *   `true`: sorts the query results in reverse chronological order.
         * *   `false`: sorts the query results in chronological order.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * The IP address of the host where the application resides.
         */
        public Builder serviceIp(String serviceIp) {
            this.putQueryParameter("ServiceIp", serviceIp);
            this.serviceIp = serviceIp;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public SearchTracesByPageRequest build() {
            return new SearchTracesByPageRequest(this);
        } 

    } 

    public static class ExclusionFilters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ExclusionFilters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExclusionFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key that is used to filter the query results.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the key that is used to filter the query results.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExclusionFilters build() {
                return new ExclusionFilters(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag. The following system preset fields are provided:
             * <p>
             * 
             * *   traceId: the ID of the trace.
             * *   serverApp: the name of the server application.
             * *   clientApp: the name of the client application.
             * *   service: the name of the operation.
             * *   rpc: the type of the call.
             * *   msOfSpan: the duration exceeds a specific value.
             * *   clientIp: the IP address of the client.
             * *   serverIp: the IP address of the server.
             * *   isError: specifies whether the call is abnormal.
             * *   hasTprof: contains only thread profiling.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
