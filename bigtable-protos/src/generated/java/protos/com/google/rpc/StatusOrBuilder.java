// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/status.proto

package com.google.rpc;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 code = 1;</code>
   *
   * <pre>
   * The status code, which should be an enum value of [google.rpc.Code][google.rpc.Code].
   * </pre>
   */
  int getCode();

  /**
   * <code>optional string message = 2;</code>
   *
   * <pre>
   * A developer-facing error message, which should be in English. Any
   * user-facing error message should be localized and sent in the
   * [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
   * </pre>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 2;</code>
   *
   * <pre>
   * A developer-facing error message, which should be in English. Any
   * user-facing error message should be localized and sent in the
   * [google.rpc.Status.details][google.rpc.Status.details] field, or localized by the client.
   * </pre>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .google.protobuf.Any details = 3;</code>
   *
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   */
  java.util.List<com.google.protobuf.Any> 
      getDetailsList();
  /**
   * <code>repeated .google.protobuf.Any details = 3;</code>
   *
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   */
  com.google.protobuf.Any getDetails(int index);
  /**
   * <code>repeated .google.protobuf.Any details = 3;</code>
   *
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   */
  int getDetailsCount();
  /**
   * <code>repeated .google.protobuf.Any details = 3;</code>
   *
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getDetailsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Any details = 3;</code>
   *
   * <pre>
   * A list of messages that carry the error details.  There will be a
   * common set of message types for APIs to use.
   * </pre>
   */
  com.google.protobuf.AnyOrBuilder getDetailsOrBuilder(
      int index);
}
