// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateScreenSaverResponse} extends {@link TeaModel}
 *
 * <p>AddOrUpdateScreenSaverResponse</p>
 */
public class AddOrUpdateScreenSaverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddOrUpdateScreenSaverResponseBody body;

    private AddOrUpdateScreenSaverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddOrUpdateScreenSaverResponse create() {
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
    public AddOrUpdateScreenSaverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddOrUpdateScreenSaverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddOrUpdateScreenSaverResponseBody body);

        @Override
        AddOrUpdateScreenSaverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddOrUpdateScreenSaverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddOrUpdateScreenSaverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddOrUpdateScreenSaverResponse response) {
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
        public Builder body(AddOrUpdateScreenSaverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddOrUpdateScreenSaverResponse build() {
            return new AddOrUpdateScreenSaverResponse(this);
        } 

    } 

}
