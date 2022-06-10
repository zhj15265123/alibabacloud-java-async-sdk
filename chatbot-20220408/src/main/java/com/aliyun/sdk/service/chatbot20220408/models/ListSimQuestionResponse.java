// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSimQuestionResponse} extends {@link TeaModel}
 *
 * <p>ListSimQuestionResponse</p>
 */
public class ListSimQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSimQuestionResponseBody body;

    private ListSimQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSimQuestionResponse create() {
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
    public ListSimQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSimQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSimQuestionResponseBody body);

        @Override
        ListSimQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSimQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSimQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSimQuestionResponse response) {
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
        public Builder body(ListSimQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSimQuestionResponse build() {
            return new ListSimQuestionResponse(this);
        } 

    } 

}
