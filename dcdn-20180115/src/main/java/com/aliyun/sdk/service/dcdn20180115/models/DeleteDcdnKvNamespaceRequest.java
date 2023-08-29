// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnKvNamespaceRequest</p>
 */
public class DeleteDcdnKvNamespaceRequest extends Request {
    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private DeleteDcdnKvNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnKvNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<DeleteDcdnKvNamespaceRequest, Builder> {
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnKvNamespaceRequest request) {
            super(request);
            this.namespace = request.namespace;
        } 

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteDcdnKvNamespaceRequest build() {
            return new DeleteDcdnKvNamespaceRequest(this);
        } 

    } 

}
