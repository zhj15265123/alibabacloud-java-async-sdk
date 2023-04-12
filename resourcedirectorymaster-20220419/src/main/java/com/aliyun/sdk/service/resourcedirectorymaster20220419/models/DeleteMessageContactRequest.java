// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMessageContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteMessageContactRequest</p>
 */
public class DeleteMessageContactRequest extends Request {
    @Query
    @NameInMap("ContactId")
    private String contactId;

    @Query
    @NameInMap("RetainContactInMembers")
    private Boolean retainContactInMembers;

    private DeleteMessageContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.retainContactInMembers = builder.retainContactInMembers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMessageContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return retainContactInMembers
     */
    public Boolean getRetainContactInMembers() {
        return this.retainContactInMembers;
    }

    public static final class Builder extends Request.Builder<DeleteMessageContactRequest, Builder> {
        private String contactId; 
        private Boolean retainContactInMembers; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMessageContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.retainContactInMembers = request.retainContactInMembers;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * RetainContactInMembers.
         */
        public Builder retainContactInMembers(Boolean retainContactInMembers) {
            this.putQueryParameter("RetainContactInMembers", retainContactInMembers);
            this.retainContactInMembers = retainContactInMembers;
            return this;
        }

        @Override
        public DeleteMessageContactRequest build() {
            return new DeleteMessageContactRequest(this);
        } 

    } 

}
