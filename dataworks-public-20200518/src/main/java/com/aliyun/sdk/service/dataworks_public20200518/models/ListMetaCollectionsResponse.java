// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetaCollectionsResponse} extends {@link TeaModel}
 *
 * <p>ListMetaCollectionsResponse</p>
 */
public class ListMetaCollectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListMetaCollectionsResponseBody body;

    private ListMetaCollectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListMetaCollectionsResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ListMetaCollectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMetaCollectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListMetaCollectionsResponseBody body);

        @Override
        ListMetaCollectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMetaCollectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListMetaCollectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMetaCollectionsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListMetaCollectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMetaCollectionsResponse build() {
            return new ListMetaCollectionsResponse(this);
        } 

    } 

}
