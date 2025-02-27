// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCategoryResponseBody</p>
 */
public class CreateCategoryResponseBody extends TeaModel {
    @NameInMap("Category")
    private Category category;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCategoryResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Category category; 
        private String requestId; 

        /**
         * Category.
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCategoryResponseBody build() {
            return new CreateCategoryResponseBody(this);
        } 

    } 

    public static class Category extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentCategoryId")
        private Long parentCategoryId;

        @NameInMap("Status")
        private Integer status;

        private Category(Builder builder) {
            this.categoryId = builder.categoryId;
            this.name = builder.name;
            this.parentCategoryId = builder.parentCategoryId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentCategoryId
         */
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long categoryId; 
            private String name; 
            private Long parentCategoryId; 
            private Integer status; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentCategoryId.
             */
            public Builder parentCategoryId(Long parentCategoryId) {
                this.parentCategoryId = parentCategoryId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
}
