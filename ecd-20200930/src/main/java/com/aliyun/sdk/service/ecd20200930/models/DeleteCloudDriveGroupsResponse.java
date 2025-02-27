// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCloudDriveGroupsResponse} extends {@link TeaModel}
 *
 * <p>DeleteCloudDriveGroupsResponse</p>
 */
public class DeleteCloudDriveGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCloudDriveGroupsResponseBody body;

    private DeleteCloudDriveGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCloudDriveGroupsResponse create() {
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
    public DeleteCloudDriveGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCloudDriveGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCloudDriveGroupsResponseBody body);

        @Override
        DeleteCloudDriveGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCloudDriveGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCloudDriveGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCloudDriveGroupsResponse response) {
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
        public Builder body(DeleteCloudDriveGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCloudDriveGroupsResponse build() {
            return new DeleteCloudDriveGroupsResponse(this);
        } 

    } 

}
