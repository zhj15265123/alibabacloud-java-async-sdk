// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteLogStoreRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogStoreRequest</p>
 */
public class DeleteLogStoreRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteLogStoreRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogStoreRequest create() {
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<DeleteLogStoreRequest, Builder> {
        private String logstore; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogStoreRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.project = request.project;
        } 

        /**
         * logstore 名称
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * project 名称
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public DeleteLogStoreRequest build() {
            return new DeleteLogStoreRequest(this);
        } 

    } 

}
