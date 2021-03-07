package com.carsonlius.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.carsonlius.gulimall.member.feign.CouponFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.carsonlius.gulimall.member.entity.MemberEntity;
import com.carsonlius.gulimall.member.service.MemberService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.common.utils.R;



/**
 * 会员
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:07:27
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponFeginService couponFeginService;

    @GetMapping("/coupons")
    public R test(){
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setNickname("liusen");

       R response  =  couponFeginService.memberCoupons();
       return R.ok().put("member", memberEntity).put("coupons", response.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
