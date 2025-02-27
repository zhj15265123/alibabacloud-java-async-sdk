// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetContextLogsRequest} extends {@link RequestModel}
 *
 * <p>GetContextLogsRequest</p>
 */
public class GetContextLogsRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Query
    @NameInMap("back_lines")
    @Validation(required = true)
    private Long backLines;

    @Query
    @NameInMap("forward_lines")
    @Validation(required = true)
    private Long forwardLines;

    @Query
    @NameInMap("pack_id")
    @Validation(required = true)
    private String packId;

    @Query
    @NameInMap("pack_meta")
    @Validation(required = true)
    private String packMeta;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private GetContextLogsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.backLines = builder.backLines;
        this.forwardLines = builder.forwardLines;
        this.packId = builder.packId;
        this.packMeta = builder.packMeta;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextLogsRequest create() {
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
     * @return backLines
     */
    public Long getBackLines() {
        return this.backLines;
    }

    /**
     * @return forwardLines
     */
    public Long getForwardLines() {
        return this.forwardLines;
    }

    /**
     * @return packId
     */
    public String getPackId() {
        return this.packId;
    }

    /**
     * @return packMeta
     */
    public String getPackMeta() {
        return this.packMeta;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetContextLogsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Long backLines; 
        private Long forwardLines; 
        private String packId; 
        private String packMeta; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetContextLogsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.backLines = request.backLines;
            this.forwardLines = request.forwardLines;
            this.packId = request.packId;
            this.packMeta = request.packMeta;
            this.type = request.type;
        } 

        /**
         * Project名称。
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
         * back_lines.
         */
        public Builder backLines(Long backLines) {
            this.putQueryParameter("back_lines", backLines);
            this.backLines = backLines;
            return this;
        }

        /**
         * forward_lines.
         */
        public Builder forwardLines(Long forwardLines) {
            this.putQueryParameter("forward_lines", forwardLines);
            this.forwardLines = forwardLines;
            return this;
        }

        /**
         * pack_id.
         */
        public Builder packId(String packId) {
            this.putQueryParameter("pack_id", packId);
            this.packId = packId;
            return this;
        }

        /**
         * pack_meta.
         */
        public Builder packMeta(String packMeta) {
            this.putQueryParameter("pack_meta", packMeta);
            this.packMeta = packMeta;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetContextLogsRequest build() {
            return new GetContextLogsRequest(this);
        } 

    } 

}
