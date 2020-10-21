package com.command.write;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	void execute(HttpServletRequest request, HttpServletResponse response);
	void executeByUid(HttpServletRequest request, HttpServletResponse response, int uid);
}