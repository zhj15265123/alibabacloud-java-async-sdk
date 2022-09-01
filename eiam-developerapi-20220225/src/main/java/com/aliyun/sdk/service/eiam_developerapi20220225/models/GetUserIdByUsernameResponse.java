// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByUsernameResponse} extends {@link TeaModel}
 *
 * <p>GetUserIdByUsernameResponse</p>
 */
public class GetUserIdByUsernameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserIdByUsernameResponseBody body;

    private GetUserIdByUsernameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserIdByUsernameResponse create() {
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
    public GetUserIdByUsernameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserIdByUsernameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserIdByUsernameResponseBody body);

        @Override
        GetUserIdByUsernameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserIdByUsernameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserIdByUsernameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserIdByUsernameResponse response) {
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
        public Builder body(GetUserIdByUsernameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserIdByUsernameResponse build() {
            return new GetUserIdByUsernameResponse(this);
        } 

    } 

}
