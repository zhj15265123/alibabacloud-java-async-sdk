// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIPv6TranslatorResponse} extends {@link TeaModel}
 *
 * <p>CreateIPv6TranslatorResponse</p>
 */
public class CreateIPv6TranslatorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIPv6TranslatorResponseBody body;

    private CreateIPv6TranslatorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIPv6TranslatorResponse create() {
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
    public CreateIPv6TranslatorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIPv6TranslatorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIPv6TranslatorResponseBody body);

        @Override
        CreateIPv6TranslatorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIPv6TranslatorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIPv6TranslatorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIPv6TranslatorResponse response) {
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
        public Builder body(CreateIPv6TranslatorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIPv6TranslatorResponse build() {
            return new CreateIPv6TranslatorResponse(this);
        } 

    } 

}
