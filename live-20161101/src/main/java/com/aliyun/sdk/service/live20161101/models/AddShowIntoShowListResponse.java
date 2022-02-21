// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShowIntoShowListResponse} extends {@link TeaModel}
 *
 * <p>AddShowIntoShowListResponse</p>
 */
public class AddShowIntoShowListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddShowIntoShowListResponseBody body;

    private AddShowIntoShowListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddShowIntoShowListResponse create() {
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
    public AddShowIntoShowListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddShowIntoShowListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddShowIntoShowListResponseBody body);

        @Override
        AddShowIntoShowListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddShowIntoShowListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddShowIntoShowListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddShowIntoShowListResponse response) {
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
        public Builder body(AddShowIntoShowListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddShowIntoShowListResponse build() {
            return new AddShowIntoShowListResponse(this);
        } 

    } 

}
