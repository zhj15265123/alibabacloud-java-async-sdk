// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBranchInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBranchInfoResponseBody</p>
 */
public class GetBranchInfoResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("success")
    private Boolean success;

    private GetBranchInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBranchInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBranchInfoResponseBody build() {
            return new GetBranchInfoResponseBody(this);
        } 

    } 

    public static class Author extends TeaModel {
        @NameInMap("avatarUrl")
        private String avatarUrl;

        @NameInMap("email")
        private String email;

        @NameInMap("externUid")
        private String externUid;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("state")
        private String state;

        @NameInMap("tbUserId")
        private String tbUserId;

        @NameInMap("username")
        private String username;

        private Author(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.externUid = builder.externUid;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.tbUserId = builder.tbUserId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Author create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return externUid
         */
        public String getExternUid() {
            return this.externUid;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tbUserId
         */
        public String getTbUserId() {
            return this.tbUserId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private String externUid; 
            private Long id; 
            private String name; 
            private String state; 
            private String tbUserId; 
            private String username; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * externUid.
             */
            public Builder externUid(String externUid) {
                this.externUid = externUid;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * tbUserId.
             */
            public Builder tbUserId(String tbUserId) {
                this.tbUserId = tbUserId;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Author build() {
                return new Author(this);
            } 

        } 

    }
    public static class Committer extends TeaModel {
        @NameInMap("avatarUrl")
        private String avatarUrl;

        @NameInMap("email")
        private String email;

        @NameInMap("externUid")
        private String externUid;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("state")
        private String state;

        @NameInMap("tbUserId")
        private String tbUserId;

        @NameInMap("username")
        private String username;

        private Committer(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.externUid = builder.externUid;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.tbUserId = builder.tbUserId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Committer create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return externUid
         */
        public String getExternUid() {
            return this.externUid;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tbUserId
         */
        public String getTbUserId() {
            return this.tbUserId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private String externUid; 
            private Long id; 
            private String name; 
            private String state; 
            private String tbUserId; 
            private String username; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * externUid.
             */
            public Builder externUid(String externUid) {
                this.externUid = externUid;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * tbUserId.
             */
            public Builder tbUserId(String tbUserId) {
                this.tbUserId = tbUserId;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Committer build() {
                return new Committer(this);
            } 

        } 

    }
    public static class Signature extends TeaModel {
        @NameInMap("gpgKeyId")
        private String gpgKeyId;

        @NameInMap("verificationStatus")
        private String verificationStatus;

        private Signature(Builder builder) {
            this.gpgKeyId = builder.gpgKeyId;
            this.verificationStatus = builder.verificationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signature create() {
            return builder().build();
        }

        /**
         * @return gpgKeyId
         */
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        /**
         * @return verificationStatus
         */
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public static final class Builder {
            private String gpgKeyId; 
            private String verificationStatus; 

            /**
             * gpgKeyId.
             */
            public Builder gpgKeyId(String gpgKeyId) {
                this.gpgKeyId = gpgKeyId;
                return this;
            }

            /**
             * verificationStatus.
             */
            public Builder verificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            public Signature build() {
                return new Signature(this);
            } 

        } 

    }
    public static class Commit extends TeaModel {
        @NameInMap("author")
        private Author author;

        @NameInMap("authorEmail")
        private String authorEmail;

        @NameInMap("authorName")
        private String authorName;

        @NameInMap("authoredDate")
        private String authoredDate;

        @NameInMap("commentsCount")
        private Long commentsCount;

        @NameInMap("committedDate")
        private String committedDate;

        @NameInMap("committer")
        private Committer committer;

        @NameInMap("committerEmail")
        private String committerEmail;

        @NameInMap("committerName")
        private String committerName;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("id")
        private String id;

        @NameInMap("message")
        private String message;

        @NameInMap("parentIds")
        private java.util.List < String > parentIds;

        @NameInMap("shortId")
        private String shortId;

        @NameInMap("signature")
        private Signature signature;

        @NameInMap("title")
        private String title;

        private Commit(Builder builder) {
            this.author = builder.author;
            this.authorEmail = builder.authorEmail;
            this.authorName = builder.authorName;
            this.authoredDate = builder.authoredDate;
            this.commentsCount = builder.commentsCount;
            this.committedDate = builder.committedDate;
            this.committer = builder.committer;
            this.committerEmail = builder.committerEmail;
            this.committerName = builder.committerName;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.message = builder.message;
            this.parentIds = builder.parentIds;
            this.shortId = builder.shortId;
            this.signature = builder.signature;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commit create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public Author getAuthor() {
            return this.author;
        }

        /**
         * @return authorEmail
         */
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        /**
         * @return authorName
         */
        public String getAuthorName() {
            return this.authorName;
        }

        /**
         * @return authoredDate
         */
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        /**
         * @return commentsCount
         */
        public Long getCommentsCount() {
            return this.commentsCount;
        }

        /**
         * @return committedDate
         */
        public String getCommittedDate() {
            return this.committedDate;
        }

        /**
         * @return committer
         */
        public Committer getCommitter() {
            return this.committer;
        }

        /**
         * @return committerEmail
         */
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        /**
         * @return committerName
         */
        public String getCommitterName() {
            return this.committerName;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return parentIds
         */
        public java.util.List < String > getParentIds() {
            return this.parentIds;
        }

        /**
         * @return shortId
         */
        public String getShortId() {
            return this.shortId;
        }

        /**
         * @return signature
         */
        public Signature getSignature() {
            return this.signature;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Author author; 
            private String authorEmail; 
            private String authorName; 
            private String authoredDate; 
            private Long commentsCount; 
            private String committedDate; 
            private Committer committer; 
            private String committerEmail; 
            private String committerName; 
            private String createdAt; 
            private String id; 
            private String message; 
            private java.util.List < String > parentIds; 
            private String shortId; 
            private Signature signature; 
            private String title; 

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
                return this;
            }

            /**
             * authorEmail.
             */
            public Builder authorEmail(String authorEmail) {
                this.authorEmail = authorEmail;
                return this;
            }

            /**
             * authorName.
             */
            public Builder authorName(String authorName) {
                this.authorName = authorName;
                return this;
            }

            /**
             * authoredDate.
             */
            public Builder authoredDate(String authoredDate) {
                this.authoredDate = authoredDate;
                return this;
            }

            /**
             * commentsCount.
             */
            public Builder commentsCount(Long commentsCount) {
                this.commentsCount = commentsCount;
                return this;
            }

            /**
             * committedDate.
             */
            public Builder committedDate(String committedDate) {
                this.committedDate = committedDate;
                return this;
            }

            /**
             * committer.
             */
            public Builder committer(Committer committer) {
                this.committer = committer;
                return this;
            }

            /**
             * committerEmail.
             */
            public Builder committerEmail(String committerEmail) {
                this.committerEmail = committerEmail;
                return this;
            }

            /**
             * committerName.
             */
            public Builder committerName(String committerName) {
                this.committerName = committerName;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * parentIds.
             */
            public Builder parentIds(java.util.List < String > parentIds) {
                this.parentIds = parentIds;
                return this;
            }

            /**
             * shortId.
             */
            public Builder shortId(String shortId) {
                this.shortId = shortId;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(Signature signature) {
                this.signature = signature;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Commit build() {
                return new Commit(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("commit")
        private Commit commit;

        @NameInMap("name")
        private String name;

        @NameInMap("protected")
        private String _protected;

        private Result(Builder builder) {
            this.commit = builder.commit;
            this.name = builder.name;
            this._protected = builder._protected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commit
         */
        public Commit getCommit() {
            return this.commit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return _protected
         */
        public String get_protected() {
            return this._protected;
        }

        public static final class Builder {
            private Commit commit; 
            private String name; 
            private String _protected; 

            /**
             * commit.
             */
            public Builder commit(Commit commit) {
                this.commit = commit;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protected.
             */
            public Builder _protected(String _protected) {
                this._protected = _protected;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
