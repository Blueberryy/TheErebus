package erebus.client.model.entity;

import erebus.entity.EntityAntlionBoss;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelAntlionBoss extends ModelBase {
	ModelRenderer MandR1;
	ModelRenderer MandR2;
	ModelRenderer MandR3;
	ModelRenderer MandL1;
	ModelRenderer MandL2;
	ModelRenderer MandL3;
	ModelRenderer Head;
	ModelRenderer Neck1;
	ModelRenderer Neck2;
	ModelRenderer HR2;
	ModelRenderer HL2;
	ModelRenderer ThxR2;
	ModelRenderer ThxL2;
	ModelRenderer ThxR3;
	ModelRenderer ThxL3;
	ModelRenderer ThxR4;
	ModelRenderer ThxL4;
	ModelRenderer ThxR5;
	ModelRenderer ThxL5;
	ModelRenderer ThxR6;
	ModelRenderer ThxL6;
	ModelRenderer ThxR7;
	ModelRenderer ThxL7;
	ModelRenderer ThxR9;
	ModelRenderer ThxL9;
	ModelRenderer ThxR10;
	ModelRenderer ThxL10;
	ModelRenderer Thx11;
	ModelRenderer Thx12;
	ModelRenderer RF1;
	ModelRenderer RF2;
	ModelRenderer RF3;
	ModelRenderer RM1;
	ModelRenderer RM2;
	ModelRenderer RM3;
	ModelRenderer RB1;
	ModelRenderer RB2;
	ModelRenderer RB3;
	ModelRenderer LF1;
	ModelRenderer LF2;
	ModelRenderer LF3;
	ModelRenderer LM1;
	ModelRenderer LM2;
	ModelRenderer LM3;
	ModelRenderer LB1;
	ModelRenderer LB2;
	ModelRenderer LB3;
	float addhead = 0;

	public ModelAntlionBoss() {
		textureWidth = 128;
		textureHeight = 128;
		MandR1 = new ModelRenderer(this, 110, 54);
		MandR1.addBox(-0.5F, 4F, -17F, 3, 4, 5);
		setRotation(MandR1, 0F, 0.3490659F, 0F);
		MandR2 = new ModelRenderer(this, 108, 43);
		MandR2.addBox(-0.5F, 4.5F, -24F, 2, 3, 7);
		setRotation(MandR2, 0F, 0.3490659F, 0F);
		MandR3 = new ModelRenderer(this, 114, 35);
		MandR3.addBox(-15.5F, 5F, -23F, 1, 2, 5);
		setRotation(MandR3, 0F, -0.3490659F, 0F);
		MandL1 = new ModelRenderer(this, 84, 54);
		MandL1.addBox(-2.5F, 4F, -17F, 3, 4, 5);
		setRotation(MandL1, 0F, -0.3490659F, 0F);
		MandL2 = new ModelRenderer(this, 83, 43);
		MandL2.addBox(-1.5F, 4.5F, -24F, 2, 3, 7);
		setRotation(MandL2, 0F, -0.3490659F, 0F);
		MandL3 = new ModelRenderer(this, 83, 35);
		MandL3.addBox(14.5F, 5F, -23F, 1, 2, 5);
		setRotation(MandL3, 0F, 0.3490659F, 0F);
		Head = new ModelRenderer(this, 88, 64);
		Head.addBox(-4.5F, 3F, -13.5F, 9, 5, 8);
		Head.setRotationPoint(0F, 16F, -15.5F);
		setRotation(Head, 0F, 0F, 0F);
		Neck1 = new ModelRenderer(this, 93, 78);
		Neck1.addBox(-3.5F, -2F, -8.5F, 7, 4, 5);
		Neck1.setRotationPoint(0F, 16F, -15.5F);
		setRotation(Neck1, 0.6981317F, 0F, 0F);
		Neck2 = new ModelRenderer(this, 88, 88);
		Neck2.addBox(-5.5F, -2F, -4F, 11, 5, 6);
		Neck2.setRotationPoint(0F, 16F, -15.5F);
		setRotation(Neck2, 0.5235988F, 0F, 0F);
		HR2 = new ModelRenderer(this, 100, 100);
		HR2.addBox(-0.4F, -2F, 0F, 8, 7, 5);
		HR2.setRotationPoint(0F, 13F, -10.5F);
		setRotation(HR2, -0.1745329F, -3.141593F, -0.1745329F);
		HL2 = new ModelRenderer(this, 73, 100);
		HL2.addBox(-7.6F, -2F, 0F, 8, 7, 5);
		HL2.setRotationPoint(0F, 13F, -10.5F);
		setRotation(HL2, -0.1745329F, 3.141593F, 0.1745329F);
		ThxR2 = new ModelRenderer(this, 40, 0);
		ThxR2.addBox(-10.1F, -5F, 0F, 11, 9, 5);
		ThxR2.setRotationPoint(0F, 14F, -11F);
		setRotation(ThxR2, 0F, 0F, -0.1745329F);
		ThxL2 = new ModelRenderer(this, 0, 0);
		ThxL2.addBox(-0.9F, -5F, 0F, 11, 9, 5);
		ThxL2.setRotationPoint(0F, 14F, -11F);
		setRotation(ThxL2, 0F, 0F, 0.1745329F);
		ThxR3 = new ModelRenderer(this, 40, 15);
		ThxR3.addBox(-11F, -5.5F, 0F, 12, 11, 4);
		ThxR3.setRotationPoint(0F, 13F, -6F);
		setRotation(ThxR3, 0F, 0F, -0.1745329F);
		ThxL3 = new ModelRenderer(this, 0, 15);
		ThxL3.addBox(-1F, -5.5F, -6F, 12, 11, 4);
		ThxL3.setRotationPoint(0F, 13F, 0F);
		setRotation(ThxL3, 0F, 0F, 0.1745329F);
		ThxR4 = new ModelRenderer(this, 40, 31);
		ThxR4.addBox(-11.9F, -6F, 0F, 13, 12, 5);
		ThxR4.setRotationPoint(0F, 13F, -2F);
		setRotation(ThxR4, 0F, 0F, -0.1745329F);
		ThxL4 = new ModelRenderer(this, 0, 31);
		ThxL4.addBox(-1.1F, -6F, 0F, 13, 12, 5);
		ThxL4.setRotationPoint(0F, 13F, -2F);
		setRotation(ThxL4, 0F, 0F, 0.1745329F);
		ThxR5 = new ModelRenderer(this, 44, 49);
		ThxR5.addBox(-11.8F, -6.5F, 0F, 13, 12, 5);
		ThxR5.setRotationPoint(0F, 13F, 3F);
		setRotation(ThxR5, 0F, 0F, -0.1745329F);
		ThxL5 = new ModelRenderer(this, 0, 49);
		ThxL5.addBox(-1.2F, -6.5F, 0F, 13, 12, 5);
		ThxL5.setRotationPoint(0F, 13F, 3F);
		setRotation(ThxL5, 0F, 0F, 0.1745329F);
		ThxR6 = new ModelRenderer(this, 44, 67);
		ThxR6.addBox(-11.9F, -6F, 0F, 13, 10, 6);
		ThxR6.setRotationPoint(0F, 13F, 8F);
		setRotation(ThxR6, 0F, 0F, -0.1745329F);
		ThxL6 = new ModelRenderer(this, 0, 67);
		ThxL6.addBox(-1.1F, -6F, 0F, 13, 10, 6);
		ThxL6.setRotationPoint(0F, 13F, 8F);
		setRotation(ThxL6, 0F, 0F, 0.1745329F);
		ThxR7 = new ModelRenderer(this, 44, 84);
		ThxR7.addBox(-11F, -5.5F, 0F, 12, 9, 5);
		ThxR7.setRotationPoint(0F, 14F, 14F);
		setRotation(ThxR7, 0F, 0F, -0.1745329F);
		ThxL7 = new ModelRenderer(this, 0, 84);
		ThxL7.addBox(-1F, -5.5F, 0F, 12, 9, 5);
		ThxL7.setRotationPoint(0F, 14F, 14F);
		setRotation(ThxL7, 0F, 0F, 0.1745329F);
		ThxR9 = new ModelRenderer(this, 44, 99);
		ThxR9.addBox(-9.4F, -3.5F, 0F, 10, 8, 3);
		ThxR9.setRotationPoint(0F, 14F, 18.5F);
		setRotation(ThxR9, -0.1745329F, 0F, -0.1745329F);
		ThxL9 = new ModelRenderer(this, 0, 99);
		ThxL9.addBox(-0.6F, -3.5F, 0F, 10, 8, 3);
		ThxL9.setRotationPoint(0F, 14F, 18.5F);
		setRotation(ThxL9, -0.1745329F, 0F, 0.1745329F);
		ThxR10 = new ModelRenderer(this, 44, 111);
		ThxR10.addBox(-7.6F, -2F, 0F, 8, 7, 2);
		ThxR10.setRotationPoint(0F, 14F, 21.5F);
		setRotation(ThxR10, -0.1745329F, 0F, -0.1745329F);
		ThxL10 = new ModelRenderer(this, 0, 111);
		ThxL10.addBox(-0.4F, -2F, 0F, 8, 7, 2);
		ThxL10.setRotationPoint(0F, 14F, 21.5F);
		setRotation(ThxL10, -0.1745329F, 0F, 0.1745329F);
		Thx11 = new ModelRenderer(this, 0, 121);
		Thx11.addBox(-6.5F, 0F, 0F, 13, 5, 2);
		Thx11.setRotationPoint(0F, 15F, 23.5F);
		setRotation(Thx11, -0.1745329F, 0F, 0F);
		Thx12 = new ModelRenderer(this, 40, 122);
		Thx12.addBox(-4.5F, 2F, 0F, 9, 3, 2);
		Thx12.setRotationPoint(0F, 15F, 25.5F);
		setRotation(Thx12, -0.1745329F, 0F, 0F);
		RF1 = new ModelRenderer(this, 82, 0);
		RF1.addBox(0F, -1F, -1F, 5, 2, 2);
		RF1.setRotationPoint(-6F, 19F, -13F);
		setRotation(RF1, -0.8726646F, 2.617994F, -0.8726646F);
		RF2 = new ModelRenderer(this, 82, 10);
		RF2.addBox(1.5F, 2.7F, -0.5F, 5, 2, 1);
		setRotation(RF2, 0F, 0F, -1.134464F);
		RF3 = new ModelRenderer(this, 82, 14);
		RF3.addBox(6F, -2.5F, -0.5F, 5, 1, 1);
		setRotation(RF3, 0F, 0F, -0.2617994F);
		RM1 = new ModelRenderer(this, 82, 5);
		RM1.addBox(0F, -1F, -1F, 7, 2, 2);
		RM1.setRotationPoint(-9F, 18F, -8.5F);
		setRotation(RM1, 0F, 3.141593F, -0.6981317F);
		RM2 = new ModelRenderer(this, 82, 10);
		RM2.addBox(3.5F, 4F, -0.5F, 5, 2, 1);
		setRotation(RM2, 0F, 0F, -0.8726646F);
		RM3 = new ModelRenderer(this, 82, 14);
		RM3.addBox(9F, -2F, -0.5F, 5, 1, 1);
		setRotation(RM3, 0F, 0F, -0.1745329F);
		RB1 = new ModelRenderer(this, 82, 0);
		RB1.addBox(0F, -1F, -1F, 5, 2, 2);
		RB1.setRotationPoint(-9F, 19F, -1.5F);
		setRotation(RB1, 0.7504916F, -2.4434610F, -0.7504916F);
		RB2 = new ModelRenderer(this, 82, 10);
		RB2.addBox(2.5F, 2.5F, -0.5F, 5, 2, 1);
		setRotation(RB2, 0F, 0F, -0.9250245F);
		RB3 = new ModelRenderer(this, 82, 14);
		RB3.addBox(7F, -2.5F, -0.5F, 5, 1, 1);
		setRotation(RB3, 0F, 0F, -0.2268928F);
		LF1 = new ModelRenderer(this, 82, 0);
		LF1.addBox(0F, -1F, -1F, 5, 2, 2);
		LF1.setRotationPoint(6F, 19F, -13F);
		setRotation(LF1, 0.5235988F, 0.5235988F, 0.8726646F);
		LF2 = new ModelRenderer(this, 82, 10);
		LF2.addBox(1.5F, 2.7F, -0.5F, 5, 2, 1);
		setRotation(LF2, 0F, 0F, -1.134464F);
		LF3 = new ModelRenderer(this, 82, 14);
		LF3.addBox(6F, -2.5F, -0.5F, 5, 1, 1);
		setRotation(LF3, 0F, 0, -0.2617994F);
		LM1 = new ModelRenderer(this, 82, 5);
		LM1.addBox(0F, -1F, -1F, 7, 2, 2);
		LM1.setRotationPoint(9F, 18F, -8.5F);
		setRotation(LM1, 0F, 0F, 0.6981317F);
		LM2 = new ModelRenderer(this, 82, 10);
		LM2.addBox(3.5F, 4F, -0.5F, 5, 2, 1);
		setRotation(LM2, 0F, 0F, -0.8726646F);
		LM3 = new ModelRenderer(this, 82, 14);
		LM3.addBox(9F, -2F, -0.5F, 5, 1, 1);
		setRotation(LM3, 0F, 0F, -0.1745329F);
		LB1 = new ModelRenderer(this, 82, 0);
		LB1.addBox(0F, -1F, -1F, 5, 2, 2);
		LB1.setRotationPoint(9F, 19F, -1.5F);
		setRotation(LB1, -0.7504916F, -0.6981317F, 0.7504916F);
		LB2 = new ModelRenderer(this, 82, 10);
		LB2.addBox(2.5F, 2.5F, -0.5F, 5, 2, 1);
		setRotation(LB2, 0F, 0F, -0.9250245F);
		LB3 = new ModelRenderer(this, 82, 14);
		LB3.addBox(7F, -2.5F, -0.5F, 5, 1, 1);
		setRotation(LB3, 0F, 0F, -0.2268928F);
		LF1.addChild(LF2);
		LF1.addChild(LF3);
		LM1.addChild(LM2);
		LM1.addChild(LM3);
		LB1.addChild(LB2);
		LB1.addChild(LB3);
		RF1.addChild(RF2);
		RF1.addChild(RF3);
		RM1.addChild(RM2);
		RM1.addChild(RM3);
		RB1.addChild(RB2);
		RB1.addChild(RB3);
		Head.addChild(MandR1);
		Head.addChild(MandR2);
		Head.addChild(MandR3);
		Head.addChild(MandL1);
		Head.addChild(MandL2);
		Head.addChild(MandL3);
	}

	@Override
	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, entity);
		Head.render(par7);
		Neck1.render(par7);
		Neck2.render(par7);
		HR2.render(par7);
		HL2.render(par7);
		ThxR2.render(par7);
		ThxL2.render(par7);
		ThxR3.render(par7);
		ThxL3.render(par7);
		ThxR4.render(par7);
		ThxL4.render(par7);
		ThxR5.render(par7);
		ThxL5.render(par7);
		ThxR6.render(par7);
		ThxL6.render(par7);
		ThxR7.render(par7);
		ThxL7.render(par7);
		ThxR9.render(par7);
		ThxL9.render(par7);
		ThxR10.render(par7);
		ThxL10.render(par7);
		Thx11.render(par7);
		Thx12.render(par7);
		RF1.render(par7);
		RM1.render(par7);
		RB1.render(par7);
		LF1.render(par7);
		LM1.render(par7);
		LB1.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
		EntityAntlionBoss entityAntlionBoss = (EntityAntlionBoss) entity;
		float cos1 = MathHelper.cos(par1 * 1.0F + (float) Math.PI) * 0.5F * par2;
		float cos2 = MathHelper.cos(par1 * 1.0F) * 0.5F * par2;
		float heady = par4 / (180F / (float) Math.PI);
		float headx = par5 / (180F / (float) Math.PI);

		if (entityAntlionBoss.getDataWatcher().getWatchableObjectByte(21) == 2) {
			for (addhead = 0; addhead < 17; addhead++) {
				headx = headx - addhead * 0.0053702F;
			}
		}
		Head.rotateAngleY = heady;
		Neck1.rotateAngleY = heady;
		Head.rotateAngleX = headx;
		Neck1.rotateAngleX = headx + 0.6981317F;
		MandR1.rotateAngleY = -MathHelper.cos(par1 * 0.75F) * 0.2F * par2 + 0.35F;
		MandR2.rotateAngleY = -MathHelper.cos(par1 * 0.75F) * 0.2F * par2 + 0.35F;
		MandR3.rotateAngleY = -MathHelper.cos(par1 * 0.75F) * 0.2F * par2 - 0.35F;
		MandL1.rotateAngleY = -MathHelper.cos(par1 * 0.75F + (float) Math.PI) * 0.2F * par2 - 0.35F;
		MandL2.rotateAngleY = -MathHelper.cos(par1 * 0.75F + (float) Math.PI) * 0.2F * par2 - 0.35F;
		MandL3.rotateAngleY = -MathHelper.cos(par1 * 0.75F + (float) Math.PI) * 0.2F * par2 + 0.35F;
		LB1.rotateAngleX = cos1;
		LM1.rotateAngleX = cos2;
		LF1.rotateAngleX = cos1;
		RB1.rotateAngleX = -cos2;
		RM1.rotateAngleX = -cos1;
		RF1.rotateAngleX = -cos2;
		LB1.rotateAngleY = cos1 - 0.6981317F;
		LM1.rotateAngleY = cos2;
		LF1.rotateAngleY = cos1 + 0.5235988F;
		RB1.rotateAngleY = -cos2 + 3.8397247F;
		RM1.rotateAngleY = -cos1 + 3.141593F;
		RF1.rotateAngleY = -cos2 + 2.6179942F;
	}
}