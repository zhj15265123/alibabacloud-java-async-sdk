// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSilencePolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSilencePolicyRequest</p>
 */
public class DeleteSilencePolicyRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private DeleteSilencePolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSilencePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteSilencePolicyRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSilencePolicyRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 静默策略ID
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteSilencePolicyRequest build() {
            return new DeleteSilencePolicyRequest(this);
        } 

    } 

}
