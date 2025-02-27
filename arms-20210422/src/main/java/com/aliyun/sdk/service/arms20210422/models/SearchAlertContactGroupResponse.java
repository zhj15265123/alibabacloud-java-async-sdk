// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertContactGroupResponse} extends {@link TeaModel}
 *
 * <p>SearchAlertContactGroupResponse</p>
 */
public class SearchAlertContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SearchAlertContactGroupResponseBody body;

    private SearchAlertContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SearchAlertContactGroupResponse create() {
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
    public SearchAlertContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchAlertContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SearchAlertContactGroupResponseBody body);

        @Override
        SearchAlertContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchAlertContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SearchAlertContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchAlertContactGroupResponse response) {
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
        public Builder body(SearchAlertContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchAlertContactGroupResponse build() {
            return new SearchAlertContactGroupResponse(this);
        } 

    } 

}
