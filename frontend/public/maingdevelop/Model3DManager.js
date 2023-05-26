var gdjs;(function(i){const d=new i.Logger("Model3DManager");class c{constructor(o,t){this._loadedThreeModels=new Map;this._loader=null;this._invalidModel=null;if(this._resources=o,this._resourcesLoader=t,typeof THREE!="undefined"){this._loader=new THREE_ADDONS.GLTFLoader;const n=new THREE.BoxGeometry(1,1,1),e=new THREE.MeshBasicMaterial({color:"#ff00ff"});this._invalidModel=new THREE.Mesh(n,e)}}setResources(o){this._resources=o}loadModels(o,t){const e=this._resources.filter(function(l){return l.kind==="model3D"});if(e.length===0||!this._loader)return t(e.length);let r=0;for(let l=0;l<e.length;++l){const a=e[l];this._loader.load(a.file,s=>{s.scene.rotation.order="ZYX",this._loadedThreeModels.set(a.name,s.scene),r++,r===e.length?t(e.length):o(r,e.length)},void 0,s=>{d.error(s),r++,r===e.length?t(e.length):o(r,e.length)})}}getModel(o){return this._loadedThreeModels.get(o)||this._invalidModel}}i.Model3DManager=c})(gdjs||(gdjs={}));
//# sourceMappingURL=Model3DManager.js.map
