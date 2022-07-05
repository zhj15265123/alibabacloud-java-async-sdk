// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetHistogramsRequest} extends {@link RequestModel}
 *
 * <p>GetHistogramsRequest</p>
 */
public class GetHistogramsRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Query
    @NameInMap("from")
    @Validation(required = true)
    private Long from;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("query")
    private String query;

    @Query
    @NameInMap("to")
    @Validation(required = true)
    private Long to;

    @Query
    @NameInMap("topic")
    private String topic;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private GetHistogramsRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.from = builder.from;
        this.project = builder.project;
        this.query = builder.query;
        this.to = builder.to;
        this.topic = builder.topic;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistogramsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetHistogramsRequest, Builder> {
        private String logstore; 
        private Long from; 
        private String project; 
        private String query; 
        private Long to; 
        private String topic; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetHistogramsRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.from = request.from;
            this.project = request.project;
            this.query = request.query;
            this.to = request.to;
            this.topic = request.topic;
            this.type = request.type;
        } 

        /**
         * logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 查询开始时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         * <p>
         * 
         * 时间区间遵循“左闭右开”原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 查询语句。仅支持查询语句，不支持分析语句。关于查询语句的详细语法，请参见查询语法。
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * 查询结束时间点。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         * <p>
         * 
         * 时间区间遵循“左闭右开”原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * 日志主题。
         */
        public Builder topic(String topic) {
            this.putQueryParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * Logstore中数据的类型。该接口中固定取值为histogram。
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetHistogramsRequest build() {
            return new GetHistogramsRequest(this);
        } 

    } 

}
