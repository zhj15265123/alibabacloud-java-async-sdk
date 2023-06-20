// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductRequest</p>
 */
public class DescribeProductRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private String aliUid;

    @Query
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Query
    @NameInMap("QueryDraft")
    private Boolean queryDraft;

    private DescribeProductRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.code = builder.code;
        this.queryDraft = builder.queryDraft;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return queryDraft
     */
    public Boolean getQueryDraft() {
        return this.queryDraft;
    }

    public static final class Builder extends Request.Builder<DescribeProductRequest, Builder> {
        private String aliUid; 
        private String code; 
        private Boolean queryDraft; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.code = request.code;
            this.queryDraft = request.queryDraft;
        } 

        /**
         * AliUid
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * QueryDraft.
         */
        public Builder queryDraft(Boolean queryDraft) {
            this.putQueryParameter("QueryDraft", queryDraft);
            this.queryDraft = queryDraft;
            return this;
        }

        @Override
        public DescribeProductRequest build() {
            return new DescribeProductRequest(this);
        } 

    } 

}
