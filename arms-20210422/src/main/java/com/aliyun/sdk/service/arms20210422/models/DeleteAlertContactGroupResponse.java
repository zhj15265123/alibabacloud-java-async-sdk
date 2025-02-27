// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlertContactGroupResponse</p>
 */
public class DeleteAlertContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAlertContactGroupResponseBody body;

    private DeleteAlertContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAlertContactGroupResponse create() {
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
    public DeleteAlertContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlertContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAlertContactGroupResponseBody body);

        @Override
        DeleteAlertContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlertContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAlertContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAlertContactGroupResponse response) {
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
        public Builder body(DeleteAlertContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlertContactGroupResponse build() {
            return new DeleteAlertContactGroupResponse(this);
        } 

    } 

}
