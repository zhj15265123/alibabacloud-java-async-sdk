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
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Query
    @NameInMap("from")
    @Validation(required = true)
    private Long from;

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

    private GetHistogramsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.from = builder.from;
        this.query = builder.query;
        this.to = builder.to;
        this.topic = builder.topic;
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
     * @return project
     */
    public String getProject() {
        return this.project;
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

    public static final class Builder extends Request.Builder<GetHistogramsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Long from; 
        private String query; 
        private Long to; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(GetHistogramsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.from = request.from;
            this.query = request.query;
            this.to = request.to;
            this.topic = request.topic;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public GetHistogramsRequest build() {
            return new GetHistogramsRequest(this);
        } 

    } 

}
