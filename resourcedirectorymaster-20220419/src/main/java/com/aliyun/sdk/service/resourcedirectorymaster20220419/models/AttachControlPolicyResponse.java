// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>AttachControlPolicyResponse</p>
 */
public class AttachControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachControlPolicyResponseBody body;

    private AttachControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachControlPolicyResponse create() {
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
    public AttachControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachControlPolicyResponseBody body);

        @Override
        AttachControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachControlPolicyResponse response) {
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
        public Builder body(AttachControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachControlPolicyResponse build() {
            return new AttachControlPolicyResponse(this);
        } 

    } 

}
