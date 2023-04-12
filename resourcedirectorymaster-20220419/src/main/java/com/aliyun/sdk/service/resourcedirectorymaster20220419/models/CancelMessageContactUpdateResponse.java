// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelMessageContactUpdateResponse} extends {@link TeaModel}
 *
 * <p>CancelMessageContactUpdateResponse</p>
 */
public class CancelMessageContactUpdateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelMessageContactUpdateResponseBody body;

    private CancelMessageContactUpdateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelMessageContactUpdateResponse create() {
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
    public CancelMessageContactUpdateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelMessageContactUpdateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelMessageContactUpdateResponseBody body);

        @Override
        CancelMessageContactUpdateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelMessageContactUpdateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelMessageContactUpdateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelMessageContactUpdateResponse response) {
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
        public Builder body(CancelMessageContactUpdateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelMessageContactUpdateResponse build() {
            return new CancelMessageContactUpdateResponse(this);
        } 

    } 

}
