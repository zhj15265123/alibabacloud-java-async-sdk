// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnFullDomainsBlockIPConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPConfigResponse</p>
 */
public class DescribeDcdnFullDomainsBlockIPConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDcdnFullDomainsBlockIPConfigResponseBody body;

    private DescribeDcdnFullDomainsBlockIPConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDcdnFullDomainsBlockIPConfigResponse create() {
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
    public DescribeDcdnFullDomainsBlockIPConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDcdnFullDomainsBlockIPConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDcdnFullDomainsBlockIPConfigResponseBody body);

        @Override
        DescribeDcdnFullDomainsBlockIPConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDcdnFullDomainsBlockIPConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDcdnFullDomainsBlockIPConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDcdnFullDomainsBlockIPConfigResponse response) {
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
        public Builder body(DescribeDcdnFullDomainsBlockIPConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDcdnFullDomainsBlockIPConfigResponse build() {
            return new DescribeDcdnFullDomainsBlockIPConfigResponse(this);
        } 

    } 

}
