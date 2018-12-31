package com.ankita.main.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserReponseDTO {
	
	@JsonProperty("value=data")
	private List<UserDTO> data;

	public List<UserDTO> getData() {
		return data;
	}

	public void setData(List<UserDTO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GetUserReponseDTO [data=" + data + "]";
	}

}
