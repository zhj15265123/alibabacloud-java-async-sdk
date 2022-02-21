// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpCidrsResponse} extends {@link TeaModel}
 *
 * <p>ListNatIpCidrsResponse</p>
 */
public class ListNatIpCidrsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNatIpCidrsResponseBody body;

    private ListNatIpCidrsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNatIpCidrsResponse create() {
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
    public ListNatIpCidrsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNatIpCidrsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNatIpCidrsResponseBody body);

        @Override
        ListNatIpCidrsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNatIpCidrsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNatIpCidrsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNatIpCidrsResponse response) {
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
        public Builder body(ListNatIpCidrsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNatIpCidrsResponse build() {
            return new ListNatIpCidrsResponse(this);
        } 

    } 

}
