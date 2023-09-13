// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>GetCategoriesResponseBody</p>
 */
public class GetCategoriesResponseBody extends TeaModel {
    @NameInMap("Category")
    private Category category;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCategories")
    private SubCategories subCategories;

    @NameInMap("SubTotal")
    private Long subTotal;

    private GetCategoriesResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
        this.subCategories = builder.subCategories;
        this.subTotal = builder.subTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoriesResponseBody create() {
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

    /**
     * @return subCategories
     */
    public SubCategories getSubCategories() {
        return this.subCategories;
    }

    /**
     * @return subTotal
     */
    public Long getSubTotal() {
        return this.subTotal;
    }

    public static final class Builder {
        private Category category; 
        private String requestId; 
        private SubCategories subCategories; 
        private Long subTotal; 

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

        /**
         * SubCategories.
         */
        public Builder subCategories(SubCategories subCategories) {
            this.subCategories = subCategories;
            return this;
        }

        /**
         * SubTotal.
         */
        public Builder subTotal(Long subTotal) {
            this.subTotal = subTotal;
            return this;
        }

        public GetCategoriesResponseBody build() {
            return new GetCategoriesResponseBody(this);
        } 

    } 

    public static class Category extends TeaModel {
        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("Level")
        private Long level;

        @NameInMap("ParentId")
        private Long parentId;

        @NameInMap("Type")
        private String type;

        private Category(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.level = builder.level;
            this.parentId = builder.parentId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long cateId; 
            private String cateName; 
            private Long level; 
            private Long parentId; 
            private String type; 

            /**
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
    public static class SubCategoriesCategory extends TeaModel {
        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("Level")
        private Long level;

        @NameInMap("ParentId")
        private Long parentId;

        @NameInMap("SubTotal")
        private Long subTotal;

        @NameInMap("Type")
        private String type;

        private SubCategoriesCategory(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.level = builder.level;
            this.parentId = builder.parentId;
            this.subTotal = builder.subTotal;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCategoriesCategory create() {
            return builder().build();
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return subTotal
         */
        public Long getSubTotal() {
            return this.subTotal;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long cateId; 
            private String cateName; 
            private Long level; 
            private Long parentId; 
            private Long subTotal; 
            private String type; 

            /**
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * SubTotal.
             */
            public Builder subTotal(Long subTotal) {
                this.subTotal = subTotal;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubCategoriesCategory build() {
                return new SubCategoriesCategory(this);
            } 

        } 

    }
    public static class SubCategories extends TeaModel {
        @NameInMap("Category")
        private java.util.List < SubCategoriesCategory> category;

        private SubCategories(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubCategories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List < SubCategoriesCategory> getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List < SubCategoriesCategory> category; 

            /**
             * Category.
             */
            public Builder category(java.util.List < SubCategoriesCategory> category) {
                this.category = category;
                return this;
            }

            public SubCategories build() {
                return new SubCategories(this);
            } 

        } 

    }
}
