// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchLogRequest} extends {@link RequestModel}
 *
 * <p>ListSearchLogRequest</p>
 */
public class ListSearchLogRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("beginTime")
    private Long beginTime;

    @Query
    @NameInMap("endTime")
    private Long endTime;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("query")
    @Validation(required = true)
    private String query;

    @Query
    @NameInMap("size")
    @Validation(maximum = 50, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private ListSearchLogRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.page = builder.page;
        this.query = builder.query;
        this.size = builder.size;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSearchLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListSearchLogRequest, Builder> {
        private String instanceId; 
        private Long beginTime; 
        private Long endTime; 
        private Integer page; 
        private String query; 
        private Integer size; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListSearchLogRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.page = request.page;
            this.query = request.query;
            this.size = request.size;
            this.type = request.type;
        } 

        /**
         * es-cn-n6w1o1x0w001c\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 1531910852074
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("beginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * 1531910852074
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 1
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * host:172.16.\*\*.\*\* AND content:netty
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * 20
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * INSTANCELOG
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListSearchLogRequest build() {
            return new ListSearchLogRequest(this);
        } 

    } 

}
