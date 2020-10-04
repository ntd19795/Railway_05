package com.vti.entity;

public class Position {
	public int positionid = 0; // default = 0
	public String positionName;

	public Position(int positionid) {
		this.positionid = positionid;
	}

	public Position(String positionName) {

		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionid=" + positionid + ", positionName=" + positionName + "]";
	}

//		@Override
//		public String toString() {
//			return positionName;
//		}
//		public int toString2() {
//			return positionid;
//		}

}
