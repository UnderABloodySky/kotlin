// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrStatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrStatement)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required int64 coordinates = 1;</code>
   */
  boolean hasCoordinates();
  /**
   * <code>required int64 coordinates = 1;</code>
   */
  long getCoordinates();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclaration declaration = 2;</code>
   */
  boolean hasDeclaration();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclaration declaration = 2;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclaration getDeclaration();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 3;</code>
   */
  boolean hasExpression();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression expression = 3;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrExpression getExpression();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlockBody block_body = 4;</code>
   */
  boolean hasBlockBody();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrBlockBody block_body = 4;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrBlockBody getBlockBody();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch branch = 5;</code>
   */
  boolean hasBranch();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch branch = 5;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrBranch getBranch();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrCatch catch = 6;</code>
   */
  boolean hasCatch();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrCatch catch = 6;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrCatch getCatch();

  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrSyntheticBody synthetic_body = 7;</code>
   */
  boolean hasSyntheticBody();
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrSyntheticBody synthetic_body = 7;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.IrSyntheticBody getSyntheticBody();
}