// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIPv6TranslatorAclListResponse} extends {@link TeaModel}
 *
 * <p>DeleteIPv6TranslatorAclListResponse</p>
 */
public class DeleteIPv6TranslatorAclListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIPv6TranslatorAclListResponseBody body;

    private DeleteIPv6TranslatorAclListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIPv6TranslatorAclListResponse create() {
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
    public DeleteIPv6TranslatorAclListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIPv6TranslatorAclListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIPv6TranslatorAclListResponseBody body);

        @Override
        DeleteIPv6TranslatorAclListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIPv6TranslatorAclListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIPv6TranslatorAclListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIPv6TranslatorAclListResponse response) {
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
        public Builder body(DeleteIPv6TranslatorAclListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIPv6TranslatorAclListResponse build() {
            return new DeleteIPv6TranslatorAclListResponse(this);
        } 

    } 

}
