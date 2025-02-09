/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.linkis.bml.client.errorcode;

import org.junit.jupiter.api.Test;

import static org.apache.linkis.bml.client.errorcode.BmlClientErrorCodeSummary.BML_CLIENT_FAILED;
import static org.apache.linkis.bml.client.errorcode.BmlClientErrorCodeSummary.POST_REQUEST_RESULT_NOT_MATCH;
import static org.apache.linkis.bml.client.errorcode.BmlClientErrorCodeSummary.SERVER_URL_NOT_NULL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmlClientErrorCodeSummaryTest {
  @Test
  void testGetErrorCode() {
    assertEquals(20060, POST_REQUEST_RESULT_NOT_MATCH.getErrorCode());
    assertEquals(20061, BML_CLIENT_FAILED.getErrorCode());
    assertEquals(20062, SERVER_URL_NOT_NULL.getErrorCode());
  }

  @Test
  void testSetErrorCode() {
    POST_REQUEST_RESULT_NOT_MATCH.setErrorCode(1);
    assertEquals(1, POST_REQUEST_RESULT_NOT_MATCH.getErrorCode());
    POST_REQUEST_RESULT_NOT_MATCH.setErrorCode(20060);
    assertEquals(20060, POST_REQUEST_RESULT_NOT_MATCH.getErrorCode());

    BML_CLIENT_FAILED.setErrorCode(1);
    assertEquals(1, BML_CLIENT_FAILED.getErrorCode());
    BML_CLIENT_FAILED.setErrorCode(20061);
    assertEquals(20061, BML_CLIENT_FAILED.getErrorCode());

    SERVER_URL_NOT_NULL.setErrorCode(1);
    assertEquals(1, SERVER_URL_NOT_NULL.getErrorCode());
    SERVER_URL_NOT_NULL.setErrorCode(20062);
    assertEquals(20062, SERVER_URL_NOT_NULL.getErrorCode());
  }

  @Test
  void testGetErrorDesc() {
    assertEquals(
        "the result returned by the repository client POST request does not match(物料库客户端POST请求返回的result不匹配)",
        POST_REQUEST_RESULT_NOT_MATCH.getErrorDesc());
    assertEquals(
        "failed to copy inputStream and outputStream (inputStream和outputStream流copy失败)",
        BML_CLIENT_FAILED.getErrorDesc());
    assertEquals("serverUrl cannot be null(服务器URL不能为空)", SERVER_URL_NOT_NULL.getErrorDesc());
  }

  @Test
  void testSetErrorDesc() {
    POST_REQUEST_RESULT_NOT_MATCH.setErrorDesc("test");
    assertEquals("test", POST_REQUEST_RESULT_NOT_MATCH.getErrorDesc());
    POST_REQUEST_RESULT_NOT_MATCH.setErrorDesc(
        "the result returned by the repository client POST request does not match(物料库客户端POST请求返回的result不匹配)");
    assertEquals(
        "the result returned by the repository client POST request does not match(物料库客户端POST请求返回的result不匹配)",
        POST_REQUEST_RESULT_NOT_MATCH.getErrorDesc());

    BML_CLIENT_FAILED.setErrorDesc("test");
    assertEquals("test", BML_CLIENT_FAILED.getErrorDesc());
    BML_CLIENT_FAILED.setErrorDesc(
        "failed to copy inputStream and outputStream (inputStream和outputStream流copy失败)");
    assertEquals(
        "failed to copy inputStream and outputStream (inputStream和outputStream流copy失败)",
        BML_CLIENT_FAILED.getErrorDesc());

    SERVER_URL_NOT_NULL.setErrorDesc("test");
    assertEquals("test", SERVER_URL_NOT_NULL.getErrorDesc());
    SERVER_URL_NOT_NULL.setErrorDesc("serverUrl cannot be null(服务器URL不能为空)");
    assertEquals("serverUrl cannot be null(服务器URL不能为空)", SERVER_URL_NOT_NULL.getErrorDesc());
  }

  @Test
  void testGetComment() {
    assertEquals(
        "the result returned by the repository client POST request does not match(物料库客户端POST请求返回的result不匹配)",
        POST_REQUEST_RESULT_NOT_MATCH.getComment());
    assertEquals(
        "failed to copy inputStream and outputStream (inputStream和outputStream流copy失败)",
        BML_CLIENT_FAILED.getComment());
    assertEquals("serverUrl cannot be null(服务器URL不能为空)", SERVER_URL_NOT_NULL.getComment());
  }

  @Test
  void testSetComment() {
    POST_REQUEST_RESULT_NOT_MATCH.setComment("test");
    assertEquals("test", POST_REQUEST_RESULT_NOT_MATCH.getComment());
    POST_REQUEST_RESULT_NOT_MATCH.setComment(
        "the result returned by the repository client POST request does not match(物料库客户端POST请求返回的result不匹配)");
    assertEquals(
        "the result returned by the repository client POST request does not match(物料库客户端POST请求返回的result不匹配)",
        POST_REQUEST_RESULT_NOT_MATCH.getComment());

    BML_CLIENT_FAILED.setComment("test");
    assertEquals("test", BML_CLIENT_FAILED.getComment());
    BML_CLIENT_FAILED.setComment(
        "failed to copy inputStream and outputStream (inputStream和outputStream流copy失败)");
    assertEquals(
        "failed to copy inputStream and outputStream (inputStream和outputStream流copy失败)",
        BML_CLIENT_FAILED.getComment());

    SERVER_URL_NOT_NULL.setComment("test");
    assertEquals("test", SERVER_URL_NOT_NULL.getComment());
    SERVER_URL_NOT_NULL.setComment("serverUrl cannot be null(服务器URL不能为空)");
    assertEquals("serverUrl cannot be null(服务器URL不能为空)", SERVER_URL_NOT_NULL.getComment());
  }

  @Test
  void testGetModule() {
    assertEquals("bmlClient", POST_REQUEST_RESULT_NOT_MATCH.getModule());
    assertEquals("bmlClient", BML_CLIENT_FAILED.getModule());
    assertEquals("bmlClient", SERVER_URL_NOT_NULL.getModule());
  }

  @Test
  void testSetModule() {
    POST_REQUEST_RESULT_NOT_MATCH.setModule("test");
    assertEquals("test", POST_REQUEST_RESULT_NOT_MATCH.getModule());
    POST_REQUEST_RESULT_NOT_MATCH.setModule("bmlClient");
    assertEquals("bmlClient", POST_REQUEST_RESULT_NOT_MATCH.getModule());

    BML_CLIENT_FAILED.setModule("test");
    assertEquals("test", BML_CLIENT_FAILED.getModule());
    BML_CLIENT_FAILED.setModule("bmlClient");
    assertEquals("bmlClient", BML_CLIENT_FAILED.getModule());

    SERVER_URL_NOT_NULL.setModule("test");
    assertEquals("test", SERVER_URL_NOT_NULL.getModule());
    SERVER_URL_NOT_NULL.setModule("bmlClient");
    assertEquals("bmlClient", SERVER_URL_NOT_NULL.getModule());
  }
}
