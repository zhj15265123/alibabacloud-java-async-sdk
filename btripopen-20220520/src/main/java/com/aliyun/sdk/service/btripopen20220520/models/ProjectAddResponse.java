// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProjectAddResponse} extends {@link TeaModel}
 *
 * <p>ProjectAddResponse</p>
 */
public class ProjectAddResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ProjectAddResponseBody body;

    private ProjectAddResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ProjectAddResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ProjectAddResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ProjectAddResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ProjectAddResponseBody body);

        @Override
        ProjectAddResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ProjectAddResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ProjectAddResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ProjectAddResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ProjectAddResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ProjectAddResponse build() {
            return new ProjectAddResponse(this);
        } 

    } 

}
