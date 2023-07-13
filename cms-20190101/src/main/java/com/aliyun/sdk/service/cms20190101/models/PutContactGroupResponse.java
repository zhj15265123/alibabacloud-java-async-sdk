// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutContactGroupResponse} extends {@link TeaModel}
 *
 * <p>PutContactGroupResponse</p>
 */
public class PutContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutContactGroupResponseBody body;

    private PutContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutContactGroupResponse create() {
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
    public PutContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutContactGroupResponseBody body);

        @Override
        PutContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutContactGroupResponse response) {
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
        public Builder body(PutContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutContactGroupResponse build() {
            return new PutContactGroupResponse(this);
        } 

    } 

}
