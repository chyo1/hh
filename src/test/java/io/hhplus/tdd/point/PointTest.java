package io.hhplus.tdd.point;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {
	@Test
	void 유저가_존재하지_않음() {
		// given

		// when

		// then
	}

	@Test
	void 포인트_내역_기록이_없음() {
		// given

		// when

		// then
	}

	@Test
	void 충전하려는_포인트가_음수() {
		// given

		// when

		// then
	}

	@Test
	void 사용하려는_포인트가_음수() {
		// given

		// when

		// then
	}

	@Test
	void 보유한_포인트가_부족함() {
		// given

		// when

		// then
	}


	@Test
	void 여러_요청이_동시에_들어옴() {
		// given
		// 100 있을 때 200 사용 (에러)
		// 조회 (100)
		// 100 충전 (300)

		// when

		// then
	}


}